package com.ForLoop;

import java.util.Scanner;

public class AddDigits {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sumOfDigits = 0;

        while (number != 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }

        System.out.println("The sum of the digits is " + sumOfDigits + ".");
        scanner.close();
    }
}
