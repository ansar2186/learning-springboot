package com.springboot.product.service;

import java.util.List;

import com.springboot.product.model.Product;

public interface ProductService {

	public Product addProduct(Product product);
	
	public List<Product> getAllProduct();

	public Product getProductbyId(int id);

}
