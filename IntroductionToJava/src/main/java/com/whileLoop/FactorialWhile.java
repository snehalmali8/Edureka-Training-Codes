package com.whileLoop;

import java.util.Scanner;

public class FactorialWhile {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int factorial = 1;

        while (num > 0) {
            factorial *= num;
            num--;
        }

        System.out.println("The factorial is " + factorial + ".");
        scanner.close();
    }
}
