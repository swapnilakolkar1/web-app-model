package com.opti.shope.shared.dto;

import java.io.Serializable;

public class ProductDto implements Serializable {
	private static final long serialVersionUID = 2110023136047033487L;
	private long productId;
	private String userId;
	private String productName;
	private String productDecription;
	private int productQty;
	private Double productPrice;

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDecription() {
		return productDecription;
	}

	public void setProductDecription(String productDecription) {
		this.productDecription = productDecription;
	}

	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

}
