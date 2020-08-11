package com.ecommerce.american.stores.customer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    
	@Override
	public void configure(WebSecurity web) {
		web.ignoring().antMatchers(
				HttpMethod.GET,
				"/v2/api-docs", 
				"/swagger-resources/configuration/ui",
				"/swagger-resources", 
				"ms-cadastro-pessoa/swagger-resources/configuration/security", 
				"/swagger-ui.html", 
				"/webjars/**","/actuator/info"
				);
	}
}