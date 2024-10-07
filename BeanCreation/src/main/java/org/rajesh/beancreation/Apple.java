package org.rajesh.beancreation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Apple {

    public void getApple(){
        System.out.println("Apple");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("PostConstruct Apple");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("PreDestroy Apple");
    }
}
