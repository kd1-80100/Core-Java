package com.sunbeam;

import java.util.Scanner;

public class Test {
	public static int menu(Scanner sc) {
		int choice;
		System.out.println("1. Addition of two numbers.");
		System.out.println("2. Subtraction of two numbers.");
		System.out.println("3. Multiplication of two numbers.");
		System.out.println("4. Division of two numbers.");
		System.out.print("Enter your choice: ");
		choice = sc.nextInt();
		return choice;
	}

	static void calculate(double d1, double d2, Arithmetic op) {
		double result = op.calc(d1, d2);
		System.out.println("Result: " + result+"\n");
		System.out.println("**************************************");
	}

	public static void main(String[] args) {
		double x, y;
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the two numbers:");
		x = sc.nextDouble();
		y = sc.nextDouble();
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1: // Addition
				Test.calculate(x, y, (a, b) -> x + y);
				break;
			case 2: // Subtraction
				Test.calculate(x, y, (a, b) -> x - y);
				break;
			case 3: // Multiplication
				Test.calculate(x, y, (a, b) -> x * y);
				break;
			case 4: // Division
				Test.calculate(x, y, (a, b) -> x / y);
				break;
			default:
				break;
			}
		}
		System.out.println("Thank you..!");
	}
}
