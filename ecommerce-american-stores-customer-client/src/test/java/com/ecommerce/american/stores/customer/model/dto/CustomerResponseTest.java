package com.ecommerce.american.stores.customer.model.dto;

import static org.junit.Assert.assertNotNull;

import java.sql.Timestamp;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CustomerResponseTest {
	
	@Test
    public void testCustomerResponse(){
		CustomerResponse customer = new CustomerResponse();

		customer.setEmail("teste@teste.com");
		customer.setName("Messias Messi");
		customer.setCreatedAt(new Timestamp(System.currentTimeMillis()));
		customer.setModifiedAt(new Timestamp(System.currentTimeMillis()));
		customer.setUsername("teste");
		
		customer.getCreatedAt();
		customer.getModifiedAt();
		customer.getUsername();
		customer.getEmail();
		customer.getName();
	    
		assertNotNull(customer);
	}
}
