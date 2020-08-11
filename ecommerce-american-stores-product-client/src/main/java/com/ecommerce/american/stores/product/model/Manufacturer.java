package com.ecommerce.american.stores.product.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity(name = "MANUFACTURER")
public class Manufacturer implements Serializable {
	
	private static final long serialVersionUID = -7380913488572616575L;

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "manufacturer_id")
    private Long manufacturerId;
	
	@Column(name = "fantasy_name", nullable = false)
    private String fantasyName;
	
	@Column(name = "company_name", nullable = false)
    private String companyName;
	
	@Column(name = "cnpj", nullable = false)
    private String cnpj;
	
    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private Timestamp createdAt;

    @LastModifiedDate
    @Column(name = "modified_at", nullable = true)
    private Timestamp modifiedAt;
	
    @OneToMany(mappedBy = "manufacturer", fetch = FetchType.EAGER)
    private List<Product> product;

	/**
	 * @return the manufacturerId
	 */
	public Long getManufacturerId() {
		return manufacturerId;
	}

	/**
	 * @param manufacturerId the manufacturerId to set
	 */
	public void setManufacturerId(Long manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	/**
	 * @return the fantasyName
	 */
	public String getFantasyName() {
		return fantasyName;
	}

	/**
	 * @param fantasyName the fantasyName to set
	 */
	public void setFantasyName(String fantasyName) {
		this.fantasyName = fantasyName;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
	 * @return the product
	 */
	public List<Product> getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(List<Product> product) {
		this.product = product;
	}

}