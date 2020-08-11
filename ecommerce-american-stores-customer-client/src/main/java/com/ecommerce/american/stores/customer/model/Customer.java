package com.ecommerce.american.stores.customer.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.ecommerce.american.stores.customer.model.dto.CustomerRequest;
import com.ecommerce.american.stores.customer.model.dto.CustomerResponse;

@Entity(name = "CUSTOMER")
public class Customer implements Serializable {

	private static final long serialVersionUID = 4881066475026880523L;

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "customer_id")
    private Long customerId;

	@Column(name = "name", nullable = false)
    private String name;
	
	@Column(name = "email", nullable = false)
    private String email;
	
	@Column(name = "mobile_phone", nullable = false)
	private String mobilePhone;
	
	@Column(name = "landline_phone", nullable = true)
	private String landlinePhone;
	
    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private Timestamp createdAt;

    @LastModifiedDate
    @Column(name = "modified_at", nullable = true)
    private Timestamp modifiedAt;
    
    @OneToMany(mappedBy = "customer", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<CustomerAddress> customerAddress;
    
    @OneToOne
	@JoinColumn(name = "username", insertable=true, updatable=true)
	private User user;
	
	public Customer() {
		super();
	}
	
	public Customer(CustomerRequest customerDTO) {
		this.name = customerDTO.getName();
		this.email = customerDTO.getEmail();
		this.mobilePhone = customerDTO.getMobilePhone();
		this.landlinePhone = customerDTO.getLandlinePhone();
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

	/**
	 * @return the customerAddress
	 */
	public List<CustomerAddress> getCustomerAddress() {
		return customerAddress;
	}

	/**
	 * @param customerAddress the customerAddress to set
	 */
	public void setCustomerAddress(List<CustomerAddress> customerAddress) {
		this.customerAddress = customerAddress;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Method responsible for transforming a Customer object to a CustomerResponseDTO object.
	 *
	 * @param Customer The object to be transformed.
	 * @return The equivalent CustomerResponseDTO object.
	 */
	public static CustomerResponse toDTO(Customer customer) {
	    return new CustomerResponse(customer);
	}

	public static Customer fromDTOCreate(CustomerRequest customerRequest) {
		Customer entity = new Customer(customerRequest);
		entity.setCreatedAt(new Timestamp(System.currentTimeMillis()));
		return entity;
	}

}