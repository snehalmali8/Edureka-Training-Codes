package com.org.EurekaClientDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.EurekaClientDemo.model.Product;
import com.org.EurekaClientDemo.repo.ProductRepository;
import com.org.EurekaClientDemo.response.Response;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductRepository repo;
	
	@PostMapping("/add")
	public ResponseEntity<Response> addProduct(@RequestParam String name, @RequestParam String brandName, @RequestParam Integer price) {
		Product product = new Product(null, name, brandName, price);
		System.out.println("Product:" + product);
		try {
			repo.save(product);
			Response response = new Response(101, "Product "+name+ " saved successsfully");
			return new ResponseEntity<Response>(response, HttpStatus.OK);
			
		} catch (Exception e) {
			// TODO: handle exception
			Response response = new Response(701, "Product "+name+ " not saved successsfully. Exception: " +e.getMessage());
			return new ResponseEntity<Response>(response, HttpStatus.OK);
			
		}
	}
	
	@GetMapping("/all")
	public List<Product> getAllProducts(){
		return (List<Product>) repo.findAll();
	}

}
