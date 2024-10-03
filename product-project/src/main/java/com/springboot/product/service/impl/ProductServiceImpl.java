package com.springboot.product.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.springboot.product.Repository.ProductRepository;
import com.springboot.product.exception.ProductNotFoundException;
import com.springboot.product.model.Product;
import com.springboot.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;

	@Override
	public Product addProduct(Product product) {
		product.setCreatedDate(new Date());
		// repository call save product
		return repository.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		// repository call for get all product
		return repository.findAll();
	}

	@Override
	public Product getProductbyId(int id) throws ProductNotFoundException {
		
		// repository call for get product by id
		Product product4 = repository.findById(id).orElseThrow(() -> new ProductNotFoundException(id + "ID not found , Please try with Valid ID for Updation"));
       
		return product4 ;
        
	}

	// delete Product
	@Override
	public void deleteProduct(int id) {
		/*
		 * list = list.stream().filter(product -> product.getId() != id).
		 * collect(collectors.tolist());
		 */
		repository.deleteById(id);

	}

	@Override
	public Product updateProduct(Product product, int id) throws ProductNotFoundException {
		
		Product product2 = repository.findById(id).orElseThrow(() -> new ProductNotFoundException(id +" " +" ID Not Found ,Please try wwith Valid ID for Updation"));
		product2.setProductName(product.getProductName());
		product2.setColor(product.getColor());
		product2.setModelNumber(product.getModelNumber());
		product2.setPrice(product.getPrice());
		product2.setUpdatedDate(new Date());

		Product updatedProduct = repository.saveAndFlush(product2);
		return updatedProduct;

	}

}
