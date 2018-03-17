package com.wish.list.wishList.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wish.list.wishList.dto.UserDto;
import com.wish.list.wishList.service.UserService;
import com.wish.list.wishList.wish.model.User;
import com.wish.list.wishList.wish.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getUser() {
		return userRepository.findAllUser();
	}

	@Override
	public Integer checkEmailUserExist(String email) {
		return userRepository.findUserCountByEmail(email);
	}

	@Override
	public Boolean postNewUser(UserDto userDto) {
		User user = new User();
		user.setname(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		
		if(userRepository.save(user) != null) {
			userRepository.save(user);
			return true;
		}
		return false;
	}

	@Override
	public Integer checkCurrentLoginExist(String email, String password) {
		return userRepository.findCorrectLoginUser(email, password);
	}
}
