package com.org.ProducerService.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.ProducerService.model.Book;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	Environment enviornment;
	
	@GetMapping("/data")
	public String getBookData() {
		return enviornment.getProperty("local.server.port");
	}
	@GetMapping("/getOne/{id}")
	public Book getBookById(@PathVariable Integer id) {
		return new Book(id, "Twisted", "Snehal");
	}
	
	@GetMapping("/all")
	public ArrayList<Book> getAllBook(){
		ArrayList<Book> list = new ArrayList<>();
		Book b1 = new Book(1, "AAA", "BBB");
		Book b2 = new Book(2, "CCC", "DDD");
		Book b3 = new Book(3, "EEE", "FFF");
		Book b4 = new Book(4, "GGG", "HHH");
		Book b5 = new Book(5, "III", "JJJ");
		Book b6 = new Book(6, "KKK", "LLL");
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		list.add(b6);
		return list;
	}
	
	
		
		
	
		
	

	
}
