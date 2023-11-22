package ucu.edu.ua.demo.orders;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@RequestMapping("/order")
@RestController

public class Controller {
    @Autowired
    private Service service;

    @GetMapping("/all")
    public List<Order> getAll() {
        return service.getAll();
    }

    @GetMapping("/info")
    public String getInfo(@RequestParam int userId) {
        return service.info(userId);
    }

    @PostMapping("/add")
    public int addOrder(@RequestBody Order userOrder) {
        return service.addOrder(userOrder);
    }
}