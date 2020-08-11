package com.ecommerce.american.stores.product.model.dto;

import java.io.Serializable;
import java.sql.Blob;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "Data Transfer Object (DTO) representing ProductPicture")
public class ProductPictureRequestDTO implements Serializable {
	
	private static final long serialVersionUID = -4629539815179757931L;

    private Long pictureId;
    private String name;
    private Blob image;
	/**
	 * @return the pictureId
	 */
	public Long getPictureId() {
		return pictureId;
	}
	/**
	 * @param pictureId the pictureId to set
	 */
	public void setPictureId(Long pictureId) {
		this.pictureId = pictureId;
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
    
}
