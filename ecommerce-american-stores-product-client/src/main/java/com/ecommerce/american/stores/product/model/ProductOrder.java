package com.ecommerce.american.stores.product.model;

import java.io.Serializable;
import java.math.BigDecimal;
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

@Entity(name = "PRODUCT_ORDER")
public class ProductOrder implements Serializable {
	
	private static final long serialVersionUID = 571987700711626069L;

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "product_order_id")
    private Long productOrderId;
	
	@ManyToOne
	@JoinColumn(name = "product_id", insertable=false, updatable=false)
	private Product product;
	
	@ManyToOne
	@JoinColumn(name = "sales_order_id", insertable=false, updatable=false)
	private SalesOrder salesOrder;
	
	@Column(name = "price", nullable = false)
    private BigDecimal price;
	
	@Column(name = "discount", nullable = false)
    private BigDecimal discount;
	
	@ManyToOne
	@JoinColumn(name = "discount_coupon_id", insertable=false, updatable=false)
    private DiscountCoupon discountCoupon;
	
    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private Timestamp createdAt;

    @LastModifiedDate
    @Column(name = "modified_at", nullable = true)
    private Timestamp modifiedAt;

	/**
	 * @return the productOrderId
	 */
	public Long getProductOrderId() {
		return productOrderId;
	}

	/**
	 * @param productOrderId the productOrderId to set
	 */
	public void setProductOrderId(Long productOrderId) {
		this.productOrderId = productOrderId;
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
	 * @return the salesOrder
	 */
	public SalesOrder getSalesOrder() {
		return salesOrder;
	}

	/**
	 * @param salesOrder the salesOrder to set
	 */
	public void setSalesOrder(SalesOrder salesOrder) {
		this.salesOrder = salesOrder;
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
	 * @return the discount
	 */
	public BigDecimal getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	/**
	 * @return the discountCoupon
	 */
	public DiscountCoupon getDiscountCoupon() {
		return discountCoupon;
	}

	/**
	 * @param discountCoupon the discountCoupon to set
	 */
	public void setDiscountCoupon(DiscountCoupon discountCoupon) {
		this.discountCoupon = discountCoupon;
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