package com.wish.list.wishList.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wish.list.wishList.dto.AdminDto;
import com.wish.list.wishList.service.AdminService;
import com.wish.list.wishList.wish.model.Admin;
import com.wish.list.wishList.wish.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public List<Admin> getAdmin() {
		return adminRepository.findAllAdmin();
	}

	@Override
	public Integer checkEmailAdminExist(String email) {
		return adminRepository.findAdminCountByEmail(email);
	}

	@Override
	public Boolean postNewAdmin(AdminDto adminDto) {
		Admin admin = new Admin();
		admin.setEmail(adminDto.getEmail());
		admin.setPassword(adminDto.getPassword());
		
		if(adminRepository.save(admin) != null) {
			adminRepository.save(admin);
			return true;
		}
		return false;
	}

}
