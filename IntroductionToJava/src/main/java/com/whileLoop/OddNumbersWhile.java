package com.whileLoop;

public class OddNumbersWhile {
	public static void main(String[] args) {
        int count = 0;
        int num = 1; // Starting from the first odd number

        System.out.println("First 10 odd numbers:");
        while (count < 10) {
            System.out.print(num + " ");
            num += 2; // Move to the next odd number
            count++;
        }
        System.out.println();
    }
}
