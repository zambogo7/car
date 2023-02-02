package com.guild.cars.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class CarService {
    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    public Car updateCar(Car car) {
        return carRepository.save(car);
    }

    public void deleteCar(String vin) {
        carRepository.deleteById(vin);
    }

    public Car getCar(String vin) {
        return carRepository.findById(vin).orElse(null);
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }
}
