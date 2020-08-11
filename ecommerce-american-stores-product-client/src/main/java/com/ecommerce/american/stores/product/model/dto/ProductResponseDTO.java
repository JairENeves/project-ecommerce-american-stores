package com.ecommerce.american.stores.product.model.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import com.ecommerce.american.stores.product.model.Product;
import com.ecommerce.american.stores.product.model.ProductPicture;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "Data Transfer Object (DTO) representing Product")
public class ProductResponseDTO implements Serializable {

	private static final long serialVersionUID = 8159698179100279809L;

    private Long productId;
    private String description;
    private BigDecimal price;
    private Long stock;
	private String technicalSpecification;
	private String dimension;
	private String characteristic;
    private List<ProductPictureResponseDTO> productPicture;
    
    public ProductResponseDTO() {
    	super();
    }
    
	public ProductResponseDTO(Product productEntity) {
		this.productId = productEntity.getProductId();
		this.description = productEntity.getDescription();
		this.price = productEntity.getPrice();
		this.stock = productEntity.getStock();
		this.technicalSpecification = productEntity.getTechnicalSpecification();
		this.dimension = productEntity.getDimension();
		this.characteristic = productEntity.getCharacteristic();
		this.productPicture = productEntity.getProductPicture().stream().map(ProductPicture::toDTO).collect(Collectors.toList());
	}

	/**
	 * @return the productId
	 */
	public Long getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

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
	 * @return the productPicture
	 */
	public List<ProductPictureResponseDTO> getProductPicture() {
		return productPicture;
	}

	/**
	 * @param productPicture the productPicture to set
	 */
	public void setProductPicture(List<ProductPictureResponseDTO> productPicture) {
		this.productPicture = productPicture;
	}

}
