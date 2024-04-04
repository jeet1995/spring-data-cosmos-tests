package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    private ApplicationContext applicationContext;

    private AvailabilityCacheRepository availabilityCacheRepository;

    @Autowired
    public DemoApplication(ApplicationContext applicationContext, AvailabilityCacheRepository availabilityCacheRepository) {
        this.applicationContext = applicationContext;
        this.availabilityCacheRepository = availabilityCacheRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
