package com.ecommerce.american.stores.customer.service;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import com.ecommerce.american.stores.customer.model.dto.CustomerRequest;
import com.ecommerce.american.stores.customer.model.dto.CustomerResponse;

public interface CustomerService {

	ResponseEntity<Object> findAll();

	void deleteCustomer(long id);

	CustomerResponse updateCustomer(Long customerId, CustomerRequest customer);

	CustomerResponse createCustomer(@Valid CustomerRequest customerRequest);

}
