package ee.gulho.travel.Travel.Agency.Backend.controller;

import ee.gulho.travel.Travel.Agency.Backend.model.Users;
import ee.gulho.travel.Travel.Agency.Backend.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UsersService usersService;
    @GetMapping
    public Users getCurrentUser() {
        //TODO
        return new Users();
    }
    @PostMapping
    public String registerUser(@RequestBody Users user) {
        usersService.registerUser(user);
        return "some";
    }
}
