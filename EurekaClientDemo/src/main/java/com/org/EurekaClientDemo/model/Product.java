package com.org.EurekaClientDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer pid;
	String name;
	String brandName;
	Integer price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Integer pid, String name, String brandName, Integer price) {
		super();
		this.pid = pid;
		this.name = name;
		this.brandName = brandName;
		this.price = price;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
}
