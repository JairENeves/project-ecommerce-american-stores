package com.ecommerce.auth.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EcommerceAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceAuthServerApplication.class, args);
	}
}
