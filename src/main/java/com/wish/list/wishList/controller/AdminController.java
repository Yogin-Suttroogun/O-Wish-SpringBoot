package com.wish.list.wishList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wish.list.wishList.dto.AdminDto;
import com.wish.list.wishList.service.AdminService;
import com.wish.list.wishList.wish.model.Admin;

@RestController
@RequestMapping("/admins")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Admin> getAdmin(){
		List<Admin> adminList = adminService.getAdmin();
		return adminList;
	}
	
	@RequestMapping(value = "/{email}", method = RequestMethod.GET)
	public Boolean getAdminEmail(@PathVariable String email) {
		Integer countEmail = adminService.checkEmailAdminExist(email);
		if(countEmail == 0) {
			return true;
		}
		return false;	
	}
	
	@RequestMapping(value = "/{email}/{password}", method = RequestMethod.GET)
	public Boolean getCurrentLoginAdmin(@PathVariable String email, @PathVariable String password) {
		Integer countLoginAdmin = adminService.checkCurrentAdminExist(email, password);
		if(countLoginAdmin == 1) {
			return true;
		}
		return false;
	}
	
	@RequestMapping(value = "/newAdmin", method = RequestMethod.POST)
	public Boolean postAdmin(@RequestBody AdminDto adminDto){
		try {
			adminService.postNewAdmin(adminDto);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
