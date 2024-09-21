package com.springboot.product.service.impl;

import java.util.Date;
import java.util.List;

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
		product.setCreatedDate(new Date());
	
		return repository.save(product);
	}


	@Override
	public List<Product> getAllProduct() {
		
		return repository.findAll();
	}


	@Override
	public Product getProductbyId(int id) {
		return repository.findById(id).orElseThrow();
		
	}

}
