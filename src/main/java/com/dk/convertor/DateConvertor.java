package com.dk.convertor;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateConvertor implements Converter<String, Date> {

	//转换器。
	@Override
	public Date convert(String arg0) {
		SimpleDateFormat sdf10  =  new  SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf16  =  new  SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date = null;
		try {
			if(arg0!=null && !"".equals(arg0)){
				if(arg0.length()==10){
					date = sdf10.parse(arg0);	
				}else if(arg0.length()==16){
					date = sdf16.parse(arg0);	
				}
				
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

}
