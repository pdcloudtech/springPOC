package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//enables component scanning and auto config
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
        //bootstraps the application

    }
}


