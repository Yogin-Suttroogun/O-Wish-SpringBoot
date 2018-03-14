package com.wish.list.wishList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wish.list.wishList.service.ProductService;
import com.wish.list.wishList.wish.model.Product;
import com.wish.list.wishList.wish.model.User;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Product> getUser(){
		List<Product> productList = productService.getProduct();
		return productList;
	}

}
