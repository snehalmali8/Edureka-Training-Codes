package com.org.bean2;

import org.springframework.stereotype.Component;

@Component
public class ProdClass implements Employee {

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("Production is happening");
	}

}
