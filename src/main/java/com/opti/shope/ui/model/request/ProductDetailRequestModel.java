package com.opti.shope.ui.model.request;

public class ProductDetailRequestModel {
	private String productName;
	private String productDecription;
	private int productQty;
	private Double productPrice;

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
