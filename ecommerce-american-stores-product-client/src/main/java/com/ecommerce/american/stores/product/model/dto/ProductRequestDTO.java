package com.ecommerce.american.stores.product.model.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "Data Transfer Object (DTO) representing Product")
public class ProductRequestDTO implements Serializable {
	
	private static final long serialVersionUID = -2747143608345134601L;

    private String description;
    private BigDecimal price;
    private Long stock;
	private String technicalSpecification;
	private String dimension;
	private String characteristic;
	private ManufacturerRequestDTO manufacturer;
    private List<ProductPictureRequestDTO> productPicture;

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/**
	 * @return the stock
	 */
	public Long getStock() {
		return stock;
	}
	/**
	 * @param stock the stock to set
	 */
	public void setStock(Long stock) {
		this.stock = stock;
	}
	/**
	 * @return the technicalSpecification
	 */
	public String getTechnicalSpecification() {
		return technicalSpecification;
	}
	/**
	 * @param technicalSpecification the technicalSpecification to set
	 */
	public void setTechnicalSpecification(String technicalSpecification) {
		this.technicalSpecification = technicalSpecification;
	}
	/**
	 * @return the dimension
	 */
	public String getDimension() {
		return dimension;
	}
	/**
	 * @param dimension the dimension to set
	 */
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	/**
	 * @return the characteristic
	 */
	public String getCharacteristic() {
		return characteristic;
	}
	/**
	 * @param characteristic the characteristic to set
	 */
	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}
	/**
	 * @return the manufacturer
	 */
	public ManufacturerRequestDTO getManufacturer() {
		return manufacturer;
	}
	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(ManufacturerRequestDTO manufacturer) {
		this.manufacturer = manufacturer;
	}
	/**
	 * @return the productPicture
	 */
	public List<ProductPictureRequestDTO> getProductPicture() {
		return productPicture;
	}
	/**
	 * @param productPicture the productPicture to set
	 */
	public void setProductPicture(List<ProductPictureRequestDTO> productPicture) {
		this.productPicture = productPicture;
	}
    
}
