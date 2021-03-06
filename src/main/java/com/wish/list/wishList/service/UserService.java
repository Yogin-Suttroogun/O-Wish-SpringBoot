package com.wish.list.wishList.service;

import java.util.List;

import com.wish.list.wishList.dto.UserDto;
import com.wish.list.wishList.dto.UserResetPasswordDto;
import com.wish.list.wishList.wish.model.User;

public interface UserService {
	public List<User> getUser();
	
	public Integer checkEmailUserExist(String email);
	
	public Integer checkCurrentLoginExist(String email, String password);
	
	public Boolean postNewUser(UserDto userDto);
	
	public Boolean checkUserToResetPassword(UserResetPasswordDto userResetPasswordDto);

}
