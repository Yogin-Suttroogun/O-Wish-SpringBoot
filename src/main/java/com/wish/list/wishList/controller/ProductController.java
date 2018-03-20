package com.wish.list.wishList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wish.list.wishList.dto.ProductDto;
import com.wish.list.wishList.dto.ProductUpdateItemDto;
import com.wish.list.wishList.dto.UserResetPasswordDto;
import com.wish.list.wishList.service.ProductService;
import com.wish.list.wishList.wish.model.Product;

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
	
	@RequestMapping(value = "/newItem", method = RequestMethod.POST)
	public Boolean postNewItem(@RequestBody ProductDto productDto) {
		try {
			productService.postNewItem(productDto);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	@RequestMapping(value = "/updateItem", method = RequestMethod.PUT)
	public Boolean updateUserPassword(@RequestBody ProductUpdateItemDto productUpdateItemDto) {
		try {
			productService.checkProductItemToUpdate(productUpdateItemDto);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
}
