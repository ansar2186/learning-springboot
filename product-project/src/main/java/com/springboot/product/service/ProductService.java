package com.springboot.product.service;

import java.util.List;

import com.springboot.product.exception.ProductNotFoundException;
import com.springboot.product.model.Product;

public interface ProductService {

	public Product addProduct(Product product);
	
	public List<Product> getAllProduct();

	public Product getProductbyId(int id) throws ProductNotFoundException;
    // Delete Product 
	public void deleteProduct(int id);
	// update Product
	public Product updateProduct(Product product,int id) throws ProductNotFoundException;
	
	//getproductbyModel(String model);

}
