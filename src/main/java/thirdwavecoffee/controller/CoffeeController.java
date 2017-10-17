package thirdwavecoffee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import thirdwavecoffee.dao.CoffeeDao;
import thirdwavecoffee.entity.Coffee;

import java.util.List;

/**
 * Created by alp on 16.10.2017.
 */
@RestController
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/api/coffee")
public class CoffeeController {

    @Autowired
    private CoffeeDao coffeeDao;

    @GetMapping
    public List<Coffee> list() {
        return coffeeDao.findAll();
    }

    @PostMapping
    public Coffee create(Coffee coffee) {
        return coffeeDao.save(coffee);
    }

    @PutMapping
    public Coffee update(Coffee coffee) {
        return coffeeDao.save(coffee);
    }

    @DeleteMapping
    @RequestMapping("/{id}")
    public void delete(Long id) {
        coffeeDao.delete(id);
    }

}
