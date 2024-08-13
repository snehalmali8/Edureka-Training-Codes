package com.org.SpringEurekaClientDemo.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.SpringEurekaClientDemo.model.Product;
import com.org.SpringEurekaClientDemo.model.Response;

@RestController
@RequestMapping("/app")
public class AppController {
	@GetMapping("/products")
	public Response getAllProducts() {
		Product p1 = new Product("iPhone", 70000);
		Product p2 = new Product("MI", 80000);
		Product p3 = new Product("Realme", 90000);
		Product p4 = new Product("Oppo", 100000);
		Product p5 = new Product("Vivo", 60000);
		Product p6 = new Product("Android", 50000);
		ArrayList<Product> prds = new ArrayList<>();
		prds.add(p1);
		prds.add(p2);
		prds.add(p3);
		prds.add(p4);
		prds.add(p5);
		prds.add(p6);
		
		Response r = new Response(101, " Products fetched successfully ", prds);
		return r;
	}
}
