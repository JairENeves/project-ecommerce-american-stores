 package com.ecommerce.american.stores.product.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity(name = "CUSTOMER_ADDRESS")
public class CustomerAddress implements Serializable {
	
	private static final long serialVersionUID = 4978348117188960421L;

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "customer_address_id")
    private Long customerAddressId;
	
	@ManyToOne
	@JoinColumn(name = "customer_id", insertable=true, updatable=true)
	private Customer customer;

	@Column(name = "address", nullable = false)
    private String address;
	
	@Column(name = "complement", nullable = false)
    private String complement;
	
	@Column(name = "city", nullable = false)
    private String city;
	
	@Column(name = "state", nullable = false)
    private String state;
	
	@Column(name = "country", nullable = false)
	private String country;
	
    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private Timestamp createdAt;

    @LastModifiedDate
    @Column(name = "modified_at", nullable = true)
    private Timestamp modifiedAt;
	
	public CustomerAddress() {
		super();
	}

	public CustomerAddress(Long customerAddressId, Customer customer, String address, String complement,
			String city, String state, String country) {
		super();
		this.customerAddressId = customerAddressId;
		this.customer = customer;
		this.address = address;
		this.complement = complement;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	/**
	 * @return the customerAddressId
	 */
	public Long getCustomerAddressId() {
		return customerAddressId;
	}

	/**
	 * @param customerAddressId the customerAddressId to set
	 */
	public void setCustomerAddressId(Long customerAddressId) {
		this.customerAddressId = customerAddressId;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the complement
	 */
	public String getComplement() {
		return complement;
	}

	/**
	 * @param complement the complement to set
	 */
	public void setComplement(String complement) {
		this.complement = complement;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
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