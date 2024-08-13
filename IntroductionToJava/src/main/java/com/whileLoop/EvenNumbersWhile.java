package com.whileLoop;

public class EvenNumbersWhile {
	public static void main(String[] args) {
        int count = 0;
        int num = 2; // Starting from the first even number

        System.out.println("First 10 even numbers:");
        while (count < 10) {
            System.out.print(num + " ");
            num += 2; // Move to the next even number
            count++;
        }
        System.out.println();
    }
}
