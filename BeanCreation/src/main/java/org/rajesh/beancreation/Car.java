package org.rajesh.beancreation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Car {

    @Bean
    public Car getCar(){
        return new Car();
    }
}
