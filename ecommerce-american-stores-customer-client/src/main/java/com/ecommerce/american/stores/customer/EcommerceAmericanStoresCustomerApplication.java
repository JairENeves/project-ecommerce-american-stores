package com.ecommerce.american.stores.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EcommerceAmericanStoresCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceAmericanStoresCustomerApplication.class, args);
	}

}
