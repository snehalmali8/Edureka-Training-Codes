package com.DoWhile;

import java.util.Scanner;

public class ReverseDigitsDoWhile {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;

        do {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        } while (number != 0);

        System.out.println("The reversed number is " + reversedNumber + ".");
        scanner.close();
    }
}
