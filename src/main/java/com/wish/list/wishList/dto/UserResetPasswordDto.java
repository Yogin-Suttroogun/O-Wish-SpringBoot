package com.wish.list.wishList.dto;

import java.io.Serializable;

public class UserResetPasswordDto implements Serializable{
	
	private static final long serialVersionUID = -8415193196777565402L;
	
	private String email;
	private String password;
	private String newPassword;
	
	public UserResetPasswordDto() {
		super();
	}
	
	public UserResetPasswordDto(String email, String password, String newPassword) {
		super();
		this.email = email;
		this.password = password;
		this.newPassword = newPassword;
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

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
}
