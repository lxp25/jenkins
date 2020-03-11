package com.dk.pojo;

import java.util.Date;

public class Car {
    private Integer carId;

    private String carName;

    private Double carPrice;

    private Integer carType;

    private Date manuTime;

    private Date expireTime;

    private Integer isLower;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName == null ? null : carName.trim();
    }

    public Double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Double carPrice) {
        this.carPrice = carPrice;
    }

    public Integer getCarType() {
        return carType;
    }

    public void setCarType(Integer carType) {
        this.carType = carType;
    }

    public Date getManuTime() {
        return manuTime;
    }

    public void setManuTime(Date manuTime) {
        this.manuTime = manuTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Integer getIsLower() {
        return isLower;
    }

    public void setIsLower(Integer isLower) {
        this.isLower = isLower;
    }
}