package com.org.ConsumerService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.ConsumerService.service.BookRestConsumer;

@RestController
@RequestMapping("/student")
public class ConsumerRestController {
	@Autowired
	BookRestConsumer consumer;
	
	@GetMapping("/data")
	public String getStudentInfo() {
		System.out.println(consumer.getClass().getName());
		return "Accessing from STUEDENT-SERVICE ==> "+consumer.getBookData();
	}
	@GetMapping("/allBooks")
	public String getBookInfo() {
		return "Accessing from STUEDENT-SERVICE ==> "+consumer.getAllBook();
	}
	@GetMapping("/getOneBook/{id}")
	public String getBookById(@PathVariable Integer id) {
		return "Accessing from STUEDENT-SERVICE ==> "+consumer.getBookById(id);
	}
}
