package thirdwavecoffee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thirdwavecoffee.dao.CoffeeDao;
import thirdwavecoffee.entity.Coffee;

import java.security.InvalidParameterException;
import java.util.List;

/**
 * Created by alp on 15.10.2017.
 */
@Service
public class CoffeeService {
    private CoffeeDao coffeeDao;

    @Autowired
    public CoffeeService(CoffeeDao coffeeDao) {
        this.coffeeDao = coffeeDao;
    }

    public List<Coffee> findAll() {
        return coffeeDao.findAll();
    }

    public Coffee createCoffee(Coffee coffee) {
        return coffeeDao.save(coffee);
    }

    public Coffee updateCoffee(Coffee coffee) {
        if (coffeeDao.exists(coffee.getId())) {
            return coffeeDao.save(coffee);
        }
        throw new InvalidParameterException();
    }

    public void deleteCoffee(Long id) {
        if (coffeeDao.exists(id)) {
            coffeeDao.delete(id);
        }
    }

}