package com.org.bean2;

import org.springframework.stereotype.Component;

@Component
public class DevClass implements Employee {


	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("devloper doing work");
	}

}
