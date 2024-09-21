package com.springboot.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.product.model.Product;
import com.springboot.product.service.ProductService;

@RestController
//@CrossOrigin
public class ProductController {
	
	@Autowired
	private ProductService service;

	@GetMapping("/")
	public String helloWorld() { 
		return "Hello World";
	}

	@PostMapping("/add-product")
	public Product addProduct(@RequestBody Product product) {
	
	Product productObj = service.addProduct(product);
		
		return productObj;
	}
	
	@GetMapping("/getAllProduct")
	public List<Product> getAllProduct(){
		List<Product> allProduct = service.getAllProduct();
		return allProduct;
		
	}
	
	@GetMapping("/getProduct/{id}")
	public Product getProductById(@PathVariable int id) {
		
		//Product productbyId = service.getProductbyId(id);
		
		return service.getProductbyId(id);
		
	}
	
}
