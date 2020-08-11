package com.ecommerce.auth.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.auth.server.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String>{
	
	Authority findByName(String name);
	
}