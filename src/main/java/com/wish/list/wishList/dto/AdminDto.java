package com.wish.list.wishList.dto;

import java.io.Serializable;

public class AdminDto implements Serializable{

	private static final long serialVersionUID = -4154048543943265223L;
	
	private String email;
	private String password;
	
	public AdminDto() {
		super();
	}

	public AdminDto(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
