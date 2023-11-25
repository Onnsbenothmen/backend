package com.ons.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class HellodockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellodockerApplication.class, args);
    }

}
