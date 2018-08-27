package com.main.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
public class ConversionApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(ConversionApplication.class, args);
	}
}
