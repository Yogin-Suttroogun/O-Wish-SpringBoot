package com.wish.list.wishList.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
