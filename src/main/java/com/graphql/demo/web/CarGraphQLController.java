package com.graphql.demo.web;


import com.graphql.demo.dao.entities.Car;
import com.graphql.demo.dao.repositories.CarRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CarGraphQLController {

    CarRepository carRepository;

    @QueryMapping
    public List<Car> getCars()
    {
        return carRepository.findAll();
    }

    @QueryMapping
    public List<Car> getCarByModel(String model)
    {
        return carRepository.findByModel(model);
    }


}
