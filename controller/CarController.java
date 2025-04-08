package com.k2n.currus.controller;

import com.k2n.currus.model.Car;
import com.k2n.currus.services.CarServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
    @Autowired
    CarServices carServices;
    @PostMapping("/cars")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Car getCars(@RequestBody Car car) {
        return carServices.addCar(car);
    }

    @GetMapping("/cars")
    @ResponseStatus(value = HttpStatus.OK)

    public List getCars(){
        return carServices.getCars();
    }

    @PutMapping("/cars")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Car updateCars(@RequestBody Car car) {
        return carServices.addCar(car);
    }

    @DeleteMapping("/cars")
    @ResponseStatus(value = HttpStatus.OK)
    public  void deleteCar(@RequestParam Long id){
        carServices.deleteCar(id);
    }
}