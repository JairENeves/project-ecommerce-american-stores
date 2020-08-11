package com.ecommerce.american.stores.customer.model;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {
	
	@Test
    public void testUser(){
		User user = new User();
		user = new User("teste");

		user.setEmail("teste@teste.com");
		user.setPassword("teste");
		user.setResetPasswordKey("teste");
		user.setUsername("teste");
		user.setActivated(true);
		user.setActivationKey("teste");
		
		user.getEmail();
		user.getPassword();
		user.getResetPasswordKey();
		user.getUsername();
		user.isActivated();
		user.getActivationKey();

		assertNotNull(user);
	}
}
