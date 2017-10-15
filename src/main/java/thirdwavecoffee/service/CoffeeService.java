package thirdwavecoffee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thirdwavecoffee.dao.CoffeeDao;
import thirdwavecoffee.entity.Coffee;

import java.security.InvalidParameterException;

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

    public Coffee create() {
        return coffeeDao.save(new Coffee());
    }

    public Coffee update(Coffee coffee) {
        if (coffeeDao.getOne(coffee.getId()) != null) {
            return coffeeDao.save(coffee);
        }
        throw new InvalidParameterException();
    }

    public void addNewItem(Long id) {
        Coffee coffee = coffeeDao.getOne(id);
        coffeeDao.save(coffee);


    }

    public void updateCoffeeName(Long id, String name) {
        Coffee coffee = coffeeDao.findOne(id);
        if (coffee != null) {
            coffee.setName(name);
            coffeeDao.save(coffee);
        } else {
            throw new InvalidParameterException();
        }
    }


    public void deleteCoffee(Long id) {
        Coffee coffee = coffeeDao.findOne(id);
        coffeeDao.delete(coffee);
    }


}