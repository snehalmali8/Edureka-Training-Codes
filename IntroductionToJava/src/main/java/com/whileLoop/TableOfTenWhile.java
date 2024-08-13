package com.whileLoop;

public class TableOfTenWhile {
	public static void main(String[] args) {
        int number = 10;
        int i = 1;

        System.out.println("Multiplication table of 10:");
        while (i <= 10) {
            System.out.println(number + " * " + i + " = " + (number * i));
            i++;
        }
    }
}
