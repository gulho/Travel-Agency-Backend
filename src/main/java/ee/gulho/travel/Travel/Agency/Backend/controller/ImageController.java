package ee.gulho.travel.Travel.Agency.Backend.controller;

import ee.gulho.travel.Travel.Agency.Backend.model.Image;
import ee.gulho.travel.Travel.Agency.Backend.model.Trip;
import ee.gulho.travel.Travel.Agency.Backend.service.FileSystemStorageService;
import ee.gulho.travel.Travel.Agency.Backend.service.ImageService;
import ee.gulho.travel.Travel.Agency.Backend.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

@RestController
@RequestMapping("/image")
public class ImageController {
    @Autowired
    private ImageService imageService;
    @Autowired
    private FileSystemStorageService fileSystemStorageService;
    @Autowired
    private TripService tripService;

    @GetMapping("/trip/{trip_id}")
    private List<Image> getAllImagesForTrip(@PathVariable Integer trip_id) {
        return imageService.getImagesByTripId(trip_id);
    }

    @PostMapping("/trip/{trip_id}")
    private boolean saveImage(@RequestParam("file") MultipartFile[] multipartFiles, @PathVariable Integer trip_id) {
        Trip trip = tripService.getTripById(trip_id);
        for(MultipartFile multipartFile : multipartFiles) {
            String name = fileSystemStorageService.store(multipartFile);
            Image image = new Image();
            image.setFileName(name);
            image.setTrip(trip);
            imageService.saveImage(image);
           /* trip.getImages().add(image);*/
        }
        tripService.saveTrip(trip);
        return true;
    }
    @ResponseBody
    @RequestMapping(value = "/{id}", produces = MediaType.IMAGE_JPEG_VALUE, method = RequestMethod.GET)
    public ResponseEntity<byte[]> getImageById(@PathVariable Integer id) throws IOException {
        Image image = imageService.getImageById(id);
        //File file = new File(fileSystemStorageService.getStoragePath() + "/" + image.getFileSystemName())
        return ResponseEntity.ok(
                Files.readAllBytes(fileSystemStorageService.load(image.getFileName())));
    }
}
