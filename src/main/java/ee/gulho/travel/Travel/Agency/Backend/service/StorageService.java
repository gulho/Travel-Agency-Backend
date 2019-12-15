package ee.gulho.travel.Travel.Agency.Backend.service;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;

@Service
public interface StorageService {
    void init();

    String store(MultipartFile file);

    Path load(String fileName);

    Resource loadAsResource(String fileName);

    void delete(String fileName);
}
