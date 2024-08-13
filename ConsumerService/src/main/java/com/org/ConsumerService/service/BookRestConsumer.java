package com.org.ConsumerService.service;

import java.util.ArrayList;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.org.ConsumerService.model.Book;

@FeignClient(name="ProducerService")
public interface BookRestConsumer {
	@GetMapping("/book/data")
	public String getBookData();
	@GetMapping("/book/getOne/{id}")
	public Book getBookById(@PathVariable("id") Integer id);
	@GetMapping("/book/all")
	public ArrayList<Book> getAllBook();
}
