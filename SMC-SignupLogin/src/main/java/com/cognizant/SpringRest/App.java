package com.cognizant.SpringRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
//@EnableEurekaClient
@ComponentScan(basePackages = "com.cognizant.*")
@EntityScan(basePackages = "com.cognizant.entity")
public class App {

	public static void main(String args[])
	{
		SpringApplication.run(App.class, args);
	}
}
