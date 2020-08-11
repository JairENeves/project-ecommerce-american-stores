package com.ecommerce.auth.server.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.ecommerce.auth.server.repository.UserRepository;

public interface UserDetailsService extends org.springframework.security.core.userdetails.UserDetailsService {

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
	public void setUserRepository(UserRepository userRepository);
	
}
