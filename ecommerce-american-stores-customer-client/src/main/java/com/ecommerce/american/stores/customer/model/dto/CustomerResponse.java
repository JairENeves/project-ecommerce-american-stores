package com.ecommerce.american.stores.customer.model.dto;

import java.io.Serializable;
import java.sql.Timestamp;

import com.ecommerce.american.stores.customer.model.Customer;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "Data Transfer Object (DTO) representing Customer")
public class CustomerResponse implements Serializable {
	
	private static final long serialVersionUID = 1477658849256227113L;
	
	private Long customerId;
    private String name;
    private String email;
    private String username;
    private Timestamp createdAt;
    private Timestamp modifiedAt;
    
    public CustomerResponse() {
    	super();
    }
    
	public CustomerResponse(Customer customerEntity) {
		this.customerId = customerEntity.getCustomerId();
		this.name = customerEntity.getName();
		this.email = customerEntity.getEmail();
		this.username = customerEntity.getUser().getUsername();
		this.createdAt = customerEntity.getCreatedAt();
		this.modifiedAt = customerEntity.getModifiedAt();
	}

	/**
	 * @return the customerId
	 */
	public Long getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the user
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param user the user to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the createdAt
	 */
	public Timestamp getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * @return the modifiedAt
	 */
	public Timestamp getModifiedAt() {
		return modifiedAt;
	}

	/**
	 * @param modifiedAt the modifiedAt to set
	 */
	public void setModifiedAt(Timestamp modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

}
