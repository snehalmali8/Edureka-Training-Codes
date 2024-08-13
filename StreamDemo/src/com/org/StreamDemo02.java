package com.org;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo02 {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1));
		list.add(new Employee(2));
		list.add(new Employee(3));
		list.add(new Employee(4));
		list.add(new Employee(5));
		
		List<Integer> ids = list.stream().filter(e -> (e.getId() > 1)).map(e -> e.getId()).collect(Collectors.toList());
		System.out.println(ids);
		
		
	}
}
