package com.dk.mapper;

import com.dk.pojo.Car;
import com.dk.pojo.CarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarMapper {
    int countByExample(CarExample example);

    int deleteByExample(CarExample example);

    int deleteByPrimaryKey(Integer carId);

    int insert(Car record);

    int insertSelective(Car record);

    List<Car> selectByExample(CarExample example);

    Car selectByPrimaryKey(Integer carId);

    int updateByExampleSelective(@Param("record") Car record, @Param("example") CarExample example);

    int updateByExample(@Param("record") Car record, @Param("example") CarExample example);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);
}