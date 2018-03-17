package com.wish.list.wishList.service;

import java.util.List;

import com.wish.list.wishList.dto.AdminDto;
import com.wish.list.wishList.wish.model.Admin;

public interface AdminService {
	public List<Admin> getAdmin();
	
	public Integer checkEmailAdminExist(String email);
	
	public Integer checkCurrentAdminExist(String email, String password);
	
	public Boolean postNewAdmin(AdminDto adminDto);
}
