package thirdwavecoffee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import thirdwavecoffee.entity.Coffee;
import thirdwavecoffee.service.CoffeeService;

import java.util.List;

/**
 * Created by alp on 16.10.2017.
 */
@RestController
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/api/coffee")
public class CoffeeController {


    @Autowired
    private CoffeeService coffeeService;

    @GetMapping
    public List<Coffee> list() {
        return coffeeService.findAll();
    }

    @PostMapping
    public Coffee create(Coffee coffee) {
        return coffeeService.createCoffee(coffee);
    }

    @PutMapping
    public Coffee update(Coffee coffee) {
        return coffeeService.updateCoffee(coffee);
    }

    @DeleteMapping
    public void delete(Long id) {
        coffeeService.deleteCoffee(id);
    }

}
