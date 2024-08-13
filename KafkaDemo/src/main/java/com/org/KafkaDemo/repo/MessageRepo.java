package com.org.KafkaDemo.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MessageRepo {
	private List<String> list = new ArrayList<>();
	
	public void addMessage(String message) {
		list.add(message);
	}
	
	public String getMessage() {
		return list.toString();
	}
}
