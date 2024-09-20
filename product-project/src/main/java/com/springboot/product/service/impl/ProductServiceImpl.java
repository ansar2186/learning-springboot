package com.springboot.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.product.Repository.ProductRepository;
import com.springboot.product.model.Product;
import com.springboot.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository repository;
	

	@Override
	public Product addProduct(Product product) {
	
		return repository.save(product);
	}

}
