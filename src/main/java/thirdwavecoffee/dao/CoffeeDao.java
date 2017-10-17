package thirdwavecoffee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thirdwavecoffee.entity.Coffee;

/**
 * Created by alp on 15.10.2017.
 */

@Repository
public interface CoffeeDao extends JpaRepository<Coffee, Long> {
}