package com.DoWhile;

import java.util.Scanner;

public class FactorialDoWhile {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        int factorial = 1;

	        do {
	            factorial *= num;
	            num--;
	        } while (num > 0);

	        System.out.println("The factorial is " + factorial + ".");
	        scanner.close();
	    }
}
