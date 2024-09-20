package com.springboot.product.controller;

import java.sql.Date;
import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.product.model.Product;

@RestController
public class ProductController {

	@GetMapping("/")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping("/add-product")
	public Product addProduct(@RequestBody Product product) {
	
		
		return product;
	}
}
