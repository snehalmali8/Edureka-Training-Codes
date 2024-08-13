package com.DoWhile;

public class OddNumbersDoWhile {
	public static void main(String[] args) {
        int count = 0;
        int num = 1; // Starting from the first odd number

        System.out.println("First 10 odd numbers:");
        do {
            System.out.print(num + " ");
            num += 2; // Move to the next odd number
            count++;
        } while (count < 10);
	}
}
