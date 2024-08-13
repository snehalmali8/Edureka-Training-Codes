package com.org;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeDemo {
	public static void main(String[] args) {
		//Create a LocalDateTime object representing the current date and time
		LocalDateTime currentDateTime = LocalDateTime.now();
		
		//Print the current date and time using a specific format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDate = currentDateTime.format(formatter);
		System.out.println("Current Date and Time: "+ formattedDate);
		
		//Access individual component of date and time
		int year = currentDateTime.getYear();
		System.out.println(year);
		
	}
}
