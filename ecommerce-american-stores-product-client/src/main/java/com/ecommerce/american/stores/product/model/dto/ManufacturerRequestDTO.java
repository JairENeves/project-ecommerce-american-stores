package com.ecommerce.american.stores.product.model.dto;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "Data Transfer Object (DTO) representing Manufacturer")
public class ManufacturerRequestDTO implements Serializable {
	
	private static final long serialVersionUID = 5053302948745863241L;

    private Long manufacturerId;
    private String fantasyName;
    private String companyName;
    private String cnpj;
    
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
    
}
