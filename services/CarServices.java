package com.k2n.currus.services;

import com.k2n.currus.model.Car;
import com.k2n.currus.repo.carrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServices {
    @Autowired
    carrepo carrepo;
    public Car addCar(Car car){
        return carrepo.save(car);
    }

    public List<Car> getCars(){
        return carrepo.findAll();
    }

    public void deleteCar(Long id) {
        carrepo.deleteById(id);
    }
}