package com.whileLoop;

import java.util.Scanner;

public class ReverseDigitsWhile {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;

        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }

        System.out.println("The reversed number is " + reversedNumber + ".");
        scanner.close();
    }
}
