package ee.gulho.travel.Travel.Agency.Backend.controller;

import ee.gulho.travel.Travel.Agency.Backend.model.Image;
import ee.gulho.travel.Travel.Agency.Backend.service.ImageService;
import ee.gulho.travel.Travel.Agency.Backend.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/image")
public class ImageController {
    @Autowired
    private ImageService imageService;
    @Autowired
    private StorageService storageService;

    @GetMapping("/trip/{trip_id}")
    private List<Image> getAllImagesForTrip(@PathVariable Integer trip_id) {
        return imageService.getImagesByTripId(trip_id);
    }

    @PostMapping("/trip/{trip_id}")
    private boolean saveImage(@RequestParam("file") MultipartFile multipartFile) {
        String name = storageService.store(multipartFile);

        return true;
    }
}