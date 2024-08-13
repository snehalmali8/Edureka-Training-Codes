package com.org;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.org.Employee;

public class Main {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"snehal","female","Java",11,10000));
		list.add(new Employee(1,"sourav","male","Python",11,20000));
		list.add(new Employee(1,"swati","female","C++",11,30000));
		list.add(new Employee(1,"kaustubh","male","C",11,40000));
		list.add(new Employee(1,"nishi","female","Kotlin",11,50000));
		list.add(new Employee(1,"prasad","male","PHP",11,60000));
		list.add(new Employee(1,"suhani","female","JS",11,70000));
		list.add(new Employee(1,"jitu","male","ReactJS",11,80000));
		list.add(new Employee(1,"vibhuti","female","Angular",11,90000));
		list.add(new Employee(1,"datta","male","VJS",11,100000));
		
		//how many men and female are there in organization
		System.out.println(list.stream().filter(person -> person.getGender() == "male").count());
		Map<String, Long> countByGender = list.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        // Printing the counts
        countByGender.forEach((gender, count) -> System.out.println("Count of " + gender + ": " + count));
		
        List<Double> salary = list.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("second highest salary "+ salary.get(1));
        
     
	}
}
