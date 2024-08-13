package com.org.bean2;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component 
public class Manager implements Employee {
	
	DevClass dev;
	ProdClass prod;
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("All Doing Work");

	}

}
