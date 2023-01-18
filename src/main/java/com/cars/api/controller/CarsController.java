
package com.cars.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.api.CarRepository;
import com.cars.api.dto.CarDTO;
import com.cars.api.model.Car;

@RestController
@RequestMapping("/")
public class CarsController {

    @Autowired
    private CarRepository repository;

    @GetMapping
    public List<Car> listAll(){
        return repository.findAll();
    }

    @PostMapping
    public void create(@RequestBody CarDTO req) {
        repository.save(new Car(req));
    }
}
