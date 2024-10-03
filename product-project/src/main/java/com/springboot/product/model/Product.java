package com.springboot.product.model;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tbl_product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "prodName")
	@NotEmpty(message = "Product Name must not be Empty")
	private String productName;
	@NotEmpty(message = "Model Number must not be empty or null")
	//@Min(value = 2, message = "Model number mininum value must be 2")
	//@Max(value = 4, message = "Model numder maximum value must be 4")
	private String modelNumber;
	private Double price;
	private String color;
	//@JsonFormat(pattern = "dd-mm-yyyy")
	private Date createdDate;
	private Date updatedDate;
	
	//productOwner
	

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String productName, String modelNumber, Double price, String color, Date createdDate,
			Date updatedDate) {
		super();
		this.id = id;
		this.productName = productName;
		this.modelNumber = modelNumber;
		this.price = price;
		this.color = color;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public java.util.Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", modelNumber=" + modelNumber + ", price="
				+ price + ", color=" + color + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}

}
