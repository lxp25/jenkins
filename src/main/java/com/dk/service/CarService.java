package com.dk.service;

import com.dk.pojo.Car;

import java.util.List;

public interface CarService {
    List<Car> selectCar();

    void addCar(Car car);

    void deletesCar(Integer ids);

    Car updateById(Integer id);

    void updateCar(Car car);
}
