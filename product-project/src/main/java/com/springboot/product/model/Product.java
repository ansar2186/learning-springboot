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
import jakarta.validation.constraints.NotNull;
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
	// @Min(value = 2, message = "Model number minimum value must be 2")
	// @Max(value = 4, message = "Model number maximum value must be 4")

	private String modelNumber;
	@NotNull
	private Double price;
	@NotEmpty(message = "Color is required ")
	private String color;

	// @JsonFormat(pattern = "dd-mm-yyyy")
	private Date createdDate;
	private Date updatedDate;

	// productOwner
	@NotEmpty(message = "productOwner is required ")
	private String productOwner;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, @NotEmpty(message = "Product Name must not be Empty") String productName,
			@NotEmpty(message = "Model Number must not be empty or null") String modelNumber,
			@NotEmpty(message = "Price must not be empty or null") @Min(value = 2, message = "price minimum value must be 2") @Max(value = 4, message = "price maximum value must be 4") Double price,
			@NotEmpty(message = "Color must not be empty or null") String color, Date createdDate, Date updatedDate,
			@NotEmpty(message = "productOwner must not be null or empty") String productOwner) {
		super();
		this.id = id;
		this.productName = productName;
		this.modelNumber = modelNumber;
		this.price = price;
		this.color = color;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.productOwner = productOwner;
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

	public Date getCreatedDate() {
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

	public String getProductOwner() {
		return productOwner;
	}

	public void setProductOwner(String productOwner) {
		this.productOwner = productOwner;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", modelNumber=" + modelNumber + ", price="
				+ price + ", color=" + color + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate
				+ ", productOwner=" + productOwner + "]";
	}
}
