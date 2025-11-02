package com.forge51;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PPTApplication {
    public static void main( String[] args )
    {
        System.out.println("running PPT");
        SpringApplication.run( PPTApplication.class, args );
    }
}
