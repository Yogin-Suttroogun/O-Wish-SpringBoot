package com.wish.list.wishList.wish.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.wish.list.wishList.wish.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
	
	@Query("select p from User p")
	public List<User> findAllUser();
}
