package com.dk.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.dk.mapper.CarMapper;
import com.dk.pojo.Car;
import com.dk.pojo.CarExample;
import com.dk.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarMapper carMapper;
    //查询
    @Override
    @Transactional(readOnly = true)
    public List<Car> selectCar() {
        List<Car> carList = carMapper.selectByExample(new CarExample());
        return carList;
    }
    //新增

    @Override
    @Transactional(rollbackFor = Exception.class,isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    public void addCar(Car car) {
        carMapper.insertSelective(car);
    }
    //批量删除

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    public void deletesCar(Integer ids) {
        carMapper.deleteByPrimaryKey(ids);
    }

    //回显

    @Override
    public Car updateById(Integer id) {
        return carMapper.selectByPrimaryKey(id);
    }
    //新增

    @Override
    public void updateCar(Car car) {
        carMapper.updateByPrimaryKeySelective(car);
    }

}
