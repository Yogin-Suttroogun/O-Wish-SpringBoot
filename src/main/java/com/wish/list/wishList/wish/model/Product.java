package com.wish.list.wishList.wish.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.mysql.jdbc.Blob;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "productID")
	private Integer productID;
	
	private String title;
	private int price;
	private String description;
	
	@Lob @Basic(fetch = FetchType.LAZY)
	@Column(length = 100000)
	private byte[] picture;
	
	private String supplier;
	
	public Product() {
	}
	
	public Product(Integer productID, String title, int price, String description, byte[] picture, String supplier) {
		super();
		this.productID = productID;
		this.title = title;
		this.price = price;
		this.description = description;
		this.picture = picture;
		this.supplier = supplier;
	}

	public Integer getProductID() {
		return productID;
	}

	public void setProductID(Integer productID) {
		this.productID = productID;
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
