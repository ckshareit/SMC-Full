package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SmcAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmcAppApplication.class, args);
	}

}
