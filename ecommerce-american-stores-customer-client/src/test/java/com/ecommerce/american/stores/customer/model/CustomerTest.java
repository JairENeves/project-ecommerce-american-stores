package com.ecommerce.american.stores.customer.model;

import static org.junit.Assert.assertNotNull;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ecommerce.american.stores.customer.model.dto.CustomerRequest;
import com.ecommerce.american.stores.customer.model.dto.CustomerResponse;

@SpringBootTest
public class CustomerTest {
	
	@SuppressWarnings("static-access")
	@Test
    public void testCustomer(){
		Customer customer = new Customer();
		customer = new Customer(new CustomerRequest());
		
		customer.setCreatedAt(new Timestamp(System.currentTimeMillis()));
		customer.setCustomerAddress(new ArrayList<>());
		customer.setCustomerId(1l);
		customer.setEmail("teste@teste.com");
		customer.setLandlinePhone("1167946466");
		customer.setMobilePhone("1946413146");
		customer.setModifiedAt(new Timestamp(System.currentTimeMillis()));
		customer.setName("Messias Messi");
		customer.setUser(new User());
		
		customer.getCreatedAt();
		customer.getCustomerAddress();
		customer.getCustomerId();
		customer.getEmail();
		customer.getLandlinePhone();
		customer.getMobilePhone();
		customer.getModifiedAt();
		customer.getName();
		customer.getUser();

		CustomerResponse dto = customer.toDTO(customer);
	    customer = customer.fromDTOCreate(new CustomerRequest());
	    
		assertNotNull(dto);
	}
}
