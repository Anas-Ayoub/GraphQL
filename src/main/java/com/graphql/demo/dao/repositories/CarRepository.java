package com.graphql.demo.dao.repositories;

import com.graphql.demo.dao.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByModel(String model);
    List<Car> findByModelAndPrice(String model, Float price);

}
