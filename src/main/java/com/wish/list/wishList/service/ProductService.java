package com.wish.list.wishList.service;

import java.util.List;

import com.wish.list.wishList.dto.ProductDto;
import com.wish.list.wishList.dto.ProductUpdateItemDto;
import com.wish.list.wishList.wish.model.Product;

public interface ProductService {
	public List<Product> getProduct();
	
	public Boolean postNewItem(ProductDto productDto);

	public Boolean checkProductItemToUpdate(ProductUpdateItemDto productUpdateItemDto);
}
