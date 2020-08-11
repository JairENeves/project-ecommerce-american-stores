package com.ecommerce.american.stores.product.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity(name = "DISCOUNT_COUPON")
public class DiscountCoupon implements Serializable {
	
	private static final long serialVersionUID = -4834833013229076999L;

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "discount_coupon_id")
    private Long discountCouponId;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "location", nullable = false)
    private String location;
	
	@Column(name = "discount", nullable = false)
    private BigDecimal discount;
	
	@Column(name = "discount_coupon", nullable = false)
    private BigDecimal discountCoupon;
	
	@Column(name = "dth_expiration", nullable = false)
	private Date dthExpiration;
	
	@Column(name = "active", nullable = false)
	private String active;
	
    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private Timestamp createdAt;

    @LastModifiedDate
    @Column(name = "modified_at", nullable = true)
    private Timestamp modifiedAt;

	/**
	 * @return the discountCouponId
	 */
	public Long getDiscountCouponId() {
		return discountCouponId;
	}

	/**
	 * @param discountCouponId the discountCouponId to set
	 */
	public void setDiscountCouponId(Long discountCouponId) {
		this.discountCouponId = discountCouponId;
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
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
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
	public BigDecimal getDiscountCoupon() {
		return discountCoupon;
	}

	/**
	 * @param discountCoupon the discountCoupon to set
	 */
	public void setDiscountCoupon(BigDecimal discountCoupon) {
		this.discountCoupon = discountCoupon;
	}

	/**
	 * @return the dthExpiration
	 */
	public Date getDthExpiration() {
		return dthExpiration;
	}

	/**
	 * @param dthExpiration the dthExpiration to set
	 */
	public void setDthExpiration(Date dthExpiration) {
		this.dthExpiration = dthExpiration;
	}

	/**
	 * @return the active
	 */
	public String getActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(String active) {
		this.active = active;
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