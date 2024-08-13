package com.DoWhile;

public class EvenNumbersDoWhile {
	public static void main(String[] args) {
        int count = 0;
        int num = 2; // Starting from the first even number

        System.out.println("First 10 even numbers:");
        do {
            System.out.print(num + " ");
            num += 2; // Move to the next even number
            count++;
        } while (count < 10);
        System.out.println();
    }
}
