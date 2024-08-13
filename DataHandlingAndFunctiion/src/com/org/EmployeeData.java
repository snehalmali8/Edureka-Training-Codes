package com.org;
import java.util.Scanner;

public class EmployeeData {

    // Function to display ID, Name, and Salary
    public static void display(int[] ids, String[] names, double[] salaries) {
        System.out.println("ID\tName\tSalary");
        for (int i = 0; i < ids.length; i++) {
            System.out.printf("%02d\t%s\t%.2f\n", ids[i], names[i], salaries[i]);
        }
    }

    // Overloaded function to display ID and Name
    public static void display(int[] ids, String[] names) {
        System.out.println("ID\tName");
        for (int i = 0; i < ids.length; i++) {
            System.out.printf("%02d\t%s\n", ids[i], names[i]);
        }
    }

    // Function to search by name and display ID and Salary
    public static void display(String searchName, int[] ids, String[] names, double[] salaries) {
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                System.out.println("ID\tName\tSalary");
                System.out.printf("%02d\t%s\t%.2f\n", ids[i], names[i], salaries[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee with name " + searchName + " not found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numEmployees = 5;
        int[] ids = new int[numEmployees];
        String[] names = new String[numEmployees];
        double[] salaries = new double[numEmployees];

        // Input employee data
        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Enter employee ID: ");
            ids[i] = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter employee name: ");
            names[i] = scanner.nextLine();

            System.out.print("Enter employee salary: ");
            salaries[i] = scanner.nextDouble();
        }

        // Display all employee data
        System.out.println("\nDisplaying all employee data:");
        display(ids, names, salaries);

        // Display only ID and Name
        System.out.println("\nDisplaying only ID and Name:");
        display(ids, names);

        // Search for an employee by name and display their record
        System.out.print("\nEnter the name of the employee to search: ");
        String searchName = scanner.nextLine();
        display(searchName, ids, names, salaries);

        scanner.close();
    }
}
