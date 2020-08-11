package com.ecommerce.american.stores.customer.model.dto;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "Data Transfer Object (DTO) representing Customer")
public class CustomerRequest implements Serializable {

	private static final long serialVersionUID = -6207895201816435657L;
	
	private String name;
    private String email;
    private String username;
    private String password;
	private String mobilePhone;
	private String landlinePhone;
    
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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the mobilePhone
	 */
	public String getMobilePhone() {
		return mobilePhone;
	}
	/**
	 * @param mobilePhone the mobilePhone to set
	 */
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	/**
	 * @return the landlinePhone
	 */
	public String getLandlinePhone() {
		return landlinePhone;
	}
	/**
	 * @param landlinePhone the landlinePhone to set
	 */
	public void setLandlinePhone(String landlinePhone) {
		this.landlinePhone = landlinePhone;
	}

}
