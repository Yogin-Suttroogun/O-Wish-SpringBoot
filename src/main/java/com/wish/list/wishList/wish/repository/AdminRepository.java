package com.wish.list.wishList.wish.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wish.list.wishList.wish.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long>{

	@Query("select a from Admin a")
	public List<Admin> findAllAdmin();
	
	@Query("select count(e.adminID) from Admin e where e.email like :email")
	public Integer findAdminCountByEmail(@Param("email") String email);
	
	@Query("select count(e.adminID) from Admin e where e.email like :email and e.password like :password")
	public Integer findCorrectLoginAdmin(@Param("email") String email, @Param("password") String password);
}
