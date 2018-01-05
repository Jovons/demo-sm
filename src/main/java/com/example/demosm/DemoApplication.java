package com.example.demosm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demosm"})
public class DemoApplication {

    public static void main(String[] args) {
            SpringApplication.run(DemoApplication.class, args);

    }

}
