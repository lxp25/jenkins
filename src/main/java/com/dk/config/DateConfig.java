package com.dk.config;

import com.dk.convertor.DateConvertor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DateConfig {
    @Bean
    public DateConvertor getDateConfig(){
        return new DateConvertor();
    }
}
