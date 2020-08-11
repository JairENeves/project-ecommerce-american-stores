package com.ecommerce.american.stores.customer.model.dto;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CustomerRequestTest {
	
	@Test
    public void testCustomerRequest(){
		CustomerRequest customer = new CustomerRequest();

		customer.setEmail("teste@teste.com");
		customer.setLandlinePhone("1167946466");
		customer.setMobilePhone("1946413146");
		customer.setName("Messias Messi");

		customer.getEmail();
		customer.getLandlinePhone();
		customer.getMobilePhone();
		customer.getName();
	    
		assertNotNull(customer);
	}
}
