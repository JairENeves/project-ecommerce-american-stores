package com.ecommerce.american.stores.product.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.ecommerce.american.stores.product.model.dto.ProductResponseDTO;

@Entity(name = "PRODUCT")
public class Product implements Serializable {
	
	private static final long serialVersionUID = -7380913488572616575L;

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "product_id")
    private Long productId;
	
	@Column(name = "description", nullable = false)
    private String description;

	@Column(name = "price", nullable = false)
    private BigDecimal price;
	
	@Column(name = "stock", nullable = false)
    private Long stock;
	
	@Column(name = "technical_specification", nullable = false, columnDefinition = "VARCHAR(4000)")
	private String technicalSpecification;
	
	@Column(name = "dimension", nullable = false, columnDefinition = "VARCHAR(4000)")
	private String dimension;
	
	@Column(name = "characteristic", nullable = false, columnDefinition = "VARCHAR(4000)")
	private String characteristic;
	
	@ManyToOne
	@JoinColumn(name = "manufacturer_id", insertable=false, updatable=false)
	private Manufacturer manufacturer;
	
    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private Timestamp createdAt;

    @LastModifiedDate
    @Column(name = "modified_at", nullable = true)
    private Timestamp modifiedAt;
	
    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER)
    private List<ProductPicture> productPicture;

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
	 * @return the manufacturer
	 */
	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
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
	 * @return the productPicture
	 */
	public List<ProductPicture> getProductPicture() {
		return productPicture;
	}

	/**
	 * @param productPicture the productPicture to set
	 */
	public void setProductPicture(List<ProductPicture> productPicture) {
		this.productPicture = productPicture;
	}
    
	/**
	 * Method responsible for transforming a Product object to a ProductResponseDTO object.
	 *
	 * @param product The object to be transformed.
	 * @return The equivalent ProductResponseDTO object.
	 */
	public static ProductResponseDTO toDTO(Product product) {
	    return new ProductResponseDTO(product);
	}

}