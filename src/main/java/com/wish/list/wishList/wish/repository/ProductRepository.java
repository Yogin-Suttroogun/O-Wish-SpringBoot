package com.wish.list.wishList.wish.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.wish.list.wishList.wish.model.Product;
import com.wish.list.wishList.wish.model.User;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{
	
	@Query("select p from Product p")
	public List<Product> findAllProduct();
	
	@Query("select p from Product p where p.title like :title")
	public Product findProductTitleToUpdateItem(@Param("title") String title);
}
