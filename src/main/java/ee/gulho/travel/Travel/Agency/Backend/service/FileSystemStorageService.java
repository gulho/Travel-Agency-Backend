package ee.gulho.travel.Travel.Agency.Backend.service;

import ee.gulho.travel.Travel.Agency.Backend.config.StorageProperties;
import ee.gulho.travel.Travel.Agency.Backend.util.StorageException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
@Service
public class FileSystemStorageService {
    private Path storagePath;

    @Autowired
    public FileSystemStorageService(StorageProperties storageProperties) {
        this.storagePath = Paths.get(storageProperties.getLocation());
    }

    @PostConstruct
    public void init() {
        try {
            Files.createDirectories(this.storagePath);
        } catch (IOException ex) {
            throw new StorageException("Storage cant be initialized");
        }
    }

    public String store(MultipartFile file) {
        String filename = StringUtils.cleanPath(file.getOriginalFilename());
        try {
            if (file.isEmpty()) {
                throw new StorageException("Failed to store empty file " + filename);
            }
            if (filename.contains("..")) {
                // This is a security check
                throw new StorageException(
                        "Cannot store file with relative path outside current directory "
                                + filename);
            }
            try (InputStream inputStream = file.getInputStream()) {
                Files.copy(inputStream, this.storagePath.resolve(filename),
                        StandardCopyOption.REPLACE_EXISTING);
            }
        }
        catch (IOException e) {
            throw new StorageException("Failed to store file " + filename, e);
        }

        return filename;
    }

    public Path load(String fileName) {
        return storagePath.resolve(fileName);
    }

    public Resource loadAsResource(String fileName) {
        return null;
    }

    public void delete(String fileName) {

    }

    public Path getStoragePath() {
        return storagePath;
    }
}
