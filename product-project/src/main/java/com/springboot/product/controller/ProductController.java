package com.springboot.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.product.exception.ProductNotFoundException;
import com.springboot.product.model.Product;
import com.springboot.product.service.ProductService;

import jakarta.validation.Valid;

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
	public Product addProduct(@RequestBody @Valid Product product) {
		// service callling for save the prduct
		Product productObj = service.addProduct(product);

		return productObj;
	}

	@GetMapping("/getAllProduct")
	public List<Product> getAllProduct() {
		// service callling for get all prduct
		List<Product> allProduct = service.getAllProduct();
		return allProduct;

	}

	@GetMapping("/getProduct/{id}")
	public Product getProductById(@PathVariable int id) throws ProductNotFoundException {

		// Product productbyId = service.getProductbyId(id);
		// service callling for get by id prduct
		return service.getProductbyId(id);

	}

	// delete handler
	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable("id") int id) {
		
		this.service.deleteProduct(id);
		return "product deleted with ID->" +id;
	}

	// update handler
	@PutMapping("/updateProduct/{id}")
	public Product updateProduct(@RequestBody @Valid Product product, @PathVariable int id) throws ProductNotFoundException {
		return this.service.updateProduct(product, id);
	}
	
	
	
	
	// getProductbyModel();

}
