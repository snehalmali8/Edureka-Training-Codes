package com.org;

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		
		Integer[] arr = new Integer[20];
		Optional<Integer> op = Optional.ofNullable(arr[10]);
		if(op.isPresent())
			System.out.println(arr[10].intValue());
		else
			System.out.println("value not present");
		
		Employee emp = new Employee(1,"snehal","female","Java",11,10000);
		Optional<Employee> op1 = Optional.ofNullable(emp);
		op1.ifPresent(e -> System.out.println("Name present "+ e.getName()));
			
		Optional<Employee> op2 = Optional.ofNullable(emp);
		
		
	}
}
