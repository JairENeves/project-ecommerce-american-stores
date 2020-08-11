package com.ecommerce.american.stores.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EcommerceAmericanStoresProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceAmericanStoresProductApplication.class, args);
	}

}
