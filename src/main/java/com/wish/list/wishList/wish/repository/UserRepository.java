package com.wish.list.wishList.wish.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.wish.list.wishList.wish.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
	
	@Query("select p from User p")
	public List<User> findAllUser();
	
	@Query("select count(e.userID) from User e where e.email like :email")
	public Integer findUserCountByEmail(@Param("email") String email);
	
	@Query("select count(e.userID) from User e where e.email like :email and e.password like :password")
	public Integer findCorrectLoginUser(@Param("email") String email, @Param("password") String password);
	
}
