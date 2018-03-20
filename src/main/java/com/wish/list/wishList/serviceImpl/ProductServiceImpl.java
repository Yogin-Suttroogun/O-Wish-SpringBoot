package com.wish.list.wishList.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wish.list.wishList.dto.ProductDto;
import com.wish.list.wishList.dto.ProductUpdateItemDto;
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

	@Override
	public Boolean postNewItem(ProductDto productDto) {
		Product product = new Product();
		product.setTitle(productDto.getTitle());
		product.setPrice(productDto.getPrice());
		product.setDescription(productDto.getDescription());
		product.setPicture(productDto.getPicture());
		product.setSupplier(productDto.getSupplier());
		
		if(productRepository.save(product) != null) {
			productRepository.save(product);
			return true;
		}
		return false;
	}

	@Override
	public Boolean checkProductItemToUpdate(ProductUpdateItemDto productUpdateItemDto) {
		Product product = productRepository.findProductTitleToItem(productUpdateItemDto.getTitle());
		
		if (productRepository.save(product) != null) {
			product.setPrice(productUpdateItemDto.getPrice());
			product.setDescription(productUpdateItemDto.getDescription());
			product.setPicture(productUpdateItemDto.getPicture());
			product.setSupplier(productUpdateItemDto.getSupplier());
			
			productRepository.save(product);
			return true;
		}
		
		return false;
	}

	@Override
	public Boolean deleteProductItem(String title) {
		Product product = productRepository.findProductTitleToItem(title);
		if(productRepository.count() > 0) {
			productRepository.delete(product);
			return true;
		}
		return false;
	}

	@Override
	public Integer checkProductTitleExist(String title) {
		return productRepository.findProductByTitle(title);
	}

}
