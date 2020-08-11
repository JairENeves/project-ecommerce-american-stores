package com.ecommerce.american.stores.customer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.american.stores.customer.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	List<Customer> findByName(Integer name);
	List<Customer> findByEmail(String email);

}