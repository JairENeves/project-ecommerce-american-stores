package com.ecommerce.american.stores.product.model;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.ecommerce.american.stores.product.model.dto.ProductPictureResponseDTO;

@Entity(name = "PRODUCT_PICTURE")
public class ProductPicture implements Serializable{
	
	private static final long serialVersionUID = -1275882428493171599L;

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "product_picture_id")
    private Long productPictureId;
	
	@Column(name = "name", nullable = false)
    private String name;
	
	@Column(name = "image", nullable = false)
    private Blob image;
	
	@Column(name = "main_image", nullable = false)
	private String mainImage;
	
	@ManyToOne
	@JoinColumn(name = "product_id", insertable=true, updatable=true)
	private Product product;

	/**
	 * @return the productPictureId
	 */
	public Long getProductPictureId() {
		return productPictureId;
	}

	/**
	 * @param productPictureId the productPictureId to set
	 */
	public void setProductPictureId(Long productPictureId) {
		this.productPictureId = productPictureId;
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

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}
	
	/**
	 * Method responsible for transforming a ProductPicture object to a ProductPictureResponseDTO object.
	 *
	 * @param product The object to be transformed.
	 * @return The equivalent ProductPictureResponseDTO object.
	 */
	public static ProductPictureResponseDTO toDTO(ProductPicture productPicture) {
	    return new ProductPictureResponseDTO(productPicture);
	}

}