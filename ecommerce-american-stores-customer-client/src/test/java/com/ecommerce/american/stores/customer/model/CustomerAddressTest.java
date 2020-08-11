package com.ecommerce.american.stores.customer.model;

import static org.junit.Assert.assertNotNull;

import java.sql.Timestamp;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CustomerAddressTest {
	
	@Test
    public void testCustomerAddress(){
		CustomerAddress customerAddress = new CustomerAddress();
		customerAddress = new CustomerAddress(1l, new Customer(), "teste", "teste","", "teste", "teste");
		customerAddress.setCreatedAt(new Timestamp(System.currentTimeMillis()));
		customerAddress.setModifiedAt(new Timestamp(System.currentTimeMillis()));
		customerAddress.setAddress("teste");
		customerAddress.setCity("teste");
		customerAddress.setComplement("teste");
		customerAddress.setCountry("teste");
		customerAddress.setCustomer(new Customer());
		customerAddress.setCustomerAddressId(1l);
		customerAddress.setState("teste");

		customerAddress.getCreatedAt();
		customerAddress.getModifiedAt();
		customerAddress.getAddress();
		customerAddress.getCity();
		customerAddress.getComplement();
		customerAddress.getCountry();
		customerAddress.getCustomer();
		customerAddress.getCustomerAddressId();
		customerAddress.getState();

		assertNotNull(customerAddress);
	}
}
