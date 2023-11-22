package ucu.edu.ua.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController

public class Controller {
    @Autowired
    private Service service;

    @GetMapping("/all")
    public List<User> getAll() {
        return service.getAll();
    }

    @PostMapping("/add")
    public void addUser(@RequestBody User user) {
        service.addUser(user);
    }
}