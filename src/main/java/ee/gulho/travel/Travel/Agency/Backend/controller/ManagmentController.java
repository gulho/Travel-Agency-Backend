package ee.gulho.travel.Travel.Agency.Backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/manage")
public class ManagmentController {
    @GetMapping("/get")
    public List<String> getAll() {
        return List.of("manage", "241432");
    }
}
