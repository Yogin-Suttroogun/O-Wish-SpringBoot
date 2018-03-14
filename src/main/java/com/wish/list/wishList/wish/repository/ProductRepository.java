package com.wish.list.wishList.wish.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.wish.list.wishList.wish.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{
	
	@Query("select p from Product p")
	public List<Product> findAllProduct();
}
