package com.ecommerce.american.stores.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.american.stores.product.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	List<Product> findByDescription(Integer name);

}