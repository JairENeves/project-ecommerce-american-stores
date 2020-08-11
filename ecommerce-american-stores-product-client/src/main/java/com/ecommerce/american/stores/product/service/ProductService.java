package com.ecommerce.american.stores.product.service;

import org.springframework.http.ResponseEntity;

public interface ProductService {

	ResponseEntity<Object> findAll();

}
