package com.springboot.product.model;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "tbl_productSaller")
public class ProductSales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sellerID;
    @Column(name = "seller_Name")
	private String sellerName;
	private String sellerEmail;
	private String phoneNumber;
	private String address;
	private String storeNumber;
	private double rating;
	private Date joinDate;
	private String Status;
	private String salesHistory;

	public ProductSales() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductSales(int sellerID, String sellerName, String sellerEmail, String phoneNumber, String address,
			String storeNumber, double rating, Date joinDate, String status, String salesHistory) {
		super();
		this.sellerID = sellerID;
		this.sellerName = sellerName;
		this.sellerEmail = sellerEmail;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.storeNumber = storeNumber;
		this.rating = rating;
		this.joinDate = joinDate;
		Status = status;
		this.salesHistory = salesHistory;
	}

	public int getSellerID() {
		return sellerID;
	}

	public void setSellerID(int sellerID) {
		this.sellerID = sellerID;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerEmail() {
		return sellerEmail;
	}

	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStoreNumber() {
		return storeNumber;
	}

	public void setStoreNumber(String storeNumber) {
		this.storeNumber = storeNumber;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getSalesHistory() {
		return salesHistory;
	}

	public void setSalesHistory(String salesHistory) {
		this.salesHistory = salesHistory;
	}

	@Override
	public String toString() {
		return "ProductSales [sellerID=" + sellerID + ", sellerName=" + sellerName + ", sellerEmail=" + sellerEmail
				+ ", phoneNumber=" + phoneNumber + ", address=" + address + ", storeNumber=" + storeNumber + ", rating="
				+ rating + ", Status=" + Status + ", salesHistory=" + salesHistory + "]";
	}

}
