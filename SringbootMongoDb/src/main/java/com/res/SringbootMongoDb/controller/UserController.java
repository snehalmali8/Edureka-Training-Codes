package com.res.SringbootMongoDb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.res.SringbootMongoDb.model.Adress;
import com.res.SringbootMongoDb.model.Response;
import com.res.SringbootMongoDb.model.User;
import com.res.SringbootMongoDb.repo.UserRepo;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserRepo user;
	
	@GetMapping("/all")
	public List<User> getAllUser(){
		return user.findAll();
	}
	
	@PostMapping("/addUser")
	public ResponseEntity<Response> addUser(@RequestParam String name, @RequestParam String email, @RequestParam String line,
			@RequestParam String city, @RequestParam String state) {
		//TODO: process POST request
		Adress a = new Adress(line, city, state);
		user.save(new User(name, email,a));
				Response r = new Response("101", "User "+name+ " saved successfully ", null);
        return new ResponseEntity<Response>(r, HttpStatus.CREATED);
	}
	
	

}
