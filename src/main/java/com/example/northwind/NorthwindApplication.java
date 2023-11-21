package com.example.northwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
// @ComponentScan(basePackages = {"com.example.northwind", "com.example.northwind.exception"})
// @EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class NorthwindApplication {

	public static void main(String[] args) {
		SpringApplication.run(NorthwindApplication.class, args);
	}

}
