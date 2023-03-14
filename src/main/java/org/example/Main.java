package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@ComponentScan(basePackages = "org.example.CustomerProfile" )
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);

    }
}
