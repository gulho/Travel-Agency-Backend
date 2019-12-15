package ee.gulho.travel.Travel.Agency.Backend.service;

import ee.gulho.travel.Travel.Agency.Backend.model.Image;
import ee.gulho.travel.Travel.Agency.Backend.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService {
    @Autowired
    private ImageRepository imageRepository;
    @Autowired
    private TripService tripService;

    public List<Image> getImagesByTripId(Integer trip_id) {
        return imageRepository.findAllByTrip(tripService.getTripById(trip_id));
    }

    public void saveImage(Image image) {
        imageRepository.save(image);
    }

    public void deleteImage(Image image) {
        imageRepository.delete(image);
    }
}
