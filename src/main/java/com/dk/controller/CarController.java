package com.dk.controller;

import com.alibaba.fastjson.JSONObject;
import com.dk.pojo.Car;
import com.dk.service.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Controller
@RequestMapping("car")
public class CarController {
    Logger logger = LoggerFactory.getLogger(CarController.class);
    @Autowired
    private CarService carService;
    //跳show页面
    @RequestMapping("tiaoshow")
    public String tiaohshow(){

        return "car/show";
    }
    //查询
    @RequestMapping("selectCar")
    @ResponseBody
    public List<Car> selectCar(){
        List<Car>  carList = carService.selectCar();

        return carList;
    }
    //跳新增页面
    @RequestMapping("tiaoadd")
    public String tiaoadd(){

        return "car/add";
    }
    //新增
    @RequestMapping("addCar")
    @ResponseBody
    public void addCar(Car car){
        try {
            carService.addCar(car);
            logger.info("新增请求参数为:{}"+JSONObject.toJSONString(car));
        }catch (Exception e){
            logger.debug("新增错误信息为",e);
        }

    }
    //删除
    @RequestMapping("deletesCar")
    @ResponseBody
    public void deletesCar(Integer ids){
            carService.deletesCar(ids);
    }
    //回显
    @RequestMapping("updateById")
    public String updateById(Integer id,Model model){
        Car car =  carService.updateById(id);
        model.addAttribute("car",car);
        return "car/update";
    }
    //修改
    @RequestMapping("updateCar")
    @ResponseBody
    public void updateCar(Car car){
            carService.updateCar(car);

    }
}
