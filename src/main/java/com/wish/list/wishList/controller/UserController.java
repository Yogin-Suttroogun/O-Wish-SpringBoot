package com.wish.list.wishList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wish.list.wishList.dto.UserDto;
import com.wish.list.wishList.service.UserService;
import com.wish.list.wishList.wish.model.User;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<User> getUser(){
		List<User> userList = userService.getUser();
		return userList;
	}
	
	@RequestMapping(value = "/{email}", method = RequestMethod.GET)
	public Boolean getUserEmail(@PathVariable String email) {
		Integer countEmail = userService.checkEmailUserExist(email);
		if(countEmail == 1) {
			return true;
		}
		return false;
	}
	
	@RequestMapping(value = "/{email}/{password}", method = RequestMethod.GET)
	public Boolean getCurrentLoginUser(@PathVariable String email, @PathVariable String password) {
		Integer countLogin = userService.checkCurrentLoginExist(email, password);
		if(countLogin == 1) {
			return true;
		}
		return false;
	}
	
	@RequestMapping(value = "/newUser", method = RequestMethod.POST)
	public Boolean postUser(@RequestBody UserDto userDto){		
		try {
			userService.postNewUser(userDto);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
