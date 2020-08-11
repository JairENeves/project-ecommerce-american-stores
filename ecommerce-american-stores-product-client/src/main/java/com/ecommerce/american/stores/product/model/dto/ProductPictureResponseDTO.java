package com.ecommerce.american.stores.product.model.dto;

import java.io.Serializable;
import java.sql.Blob;

import com.ecommerce.american.stores.product.model.ProductPicture;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "Data Transfer Object (DTO) representing ProductPicture")
public class ProductPictureResponseDTO implements Serializable {
	
	private static final long serialVersionUID = 35055859360111603L;
	
	private Long productPicture;
    private String name;
    private Blob image;
    private String mainImage;
    
    public ProductPictureResponseDTO() {
    	super();
    }
    
	public ProductPictureResponseDTO(ProductPicture productPictureEntity) {
		this.productPicture = productPictureEntity.getProductPictureId();
		this.name = productPictureEntity.getName();
		this.image = productPictureEntity.getImage();
		this.mainImage = productPictureEntity.getMainImage();
		
	}

	/**
	 * @return the productPicture
	 */
	public Long getProductPicture() {
		return productPicture;
	}

	/**
	 * @param productPicture the productPicture to set
	 */
	public void setProductPicture(Long productPicture) {
		this.productPicture = productPicture;
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
	 * @return the image
	 */
	public Blob getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(Blob image) {
		this.image = image;
	}

	/**
	 * @return the mainImage
	 */
	public String getMainImage() {
		return mainImage;
	}

	/**
	 * @param mainImage the mainImage to set
	 */
	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}

}
