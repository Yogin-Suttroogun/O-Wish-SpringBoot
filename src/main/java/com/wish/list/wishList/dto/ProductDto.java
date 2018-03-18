package com.wish.list.wishList.dto;

import java.io.Serializable;

public class ProductDto implements Serializable{

	private static final long serialVersionUID = -8668674721907460184L;
	
	private String title;
	private int price;
	private String description;
	private byte[] picture;
	private String supplier;
	
	public ProductDto() {
		super();
	}
	
	public ProductDto(String title, int price, String description, byte[] picture, String supplier) {
		super();
		this.title = title;
		this.price = price;
		this.description = description;
		this.picture = picture;
		this.supplier = supplier;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	
}
