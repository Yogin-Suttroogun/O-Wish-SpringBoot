package com.wish.list.wishList.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wish.list.wishList.service.ProductService;
import com.wish.list.wishList.wish.model.Product;
import com.wish.list.wishList.wish.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> getProduct() {
		return productRepository.findAllProduct();
	}

}
