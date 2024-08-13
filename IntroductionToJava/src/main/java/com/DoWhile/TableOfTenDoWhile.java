package com.DoWhile;

public class TableOfTenDoWhile {
	public static void main(String[] args) {
        int number = 10;
        int i = 1;

        System.out.println("Multiplication table of 10:");
        do {
            System.out.println(number + " * " + i + " = " + (number * i));
            i++;
        } while (i <= 10);
    }
}
