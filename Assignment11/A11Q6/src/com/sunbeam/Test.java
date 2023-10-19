package com.sunbeam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
	public static int menu(Scanner sc) {
		int choice;
		System.out.println("1. Add a Student in map.");
		System.out.println("2. Find a Student by roll number in map");
		System.out.print("Enter your choice: ");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		Map<Integer, Student> map = new HashMap<>();
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				Student s = new Student();
				s.accept();
				map.put(s.getRollNo(), s);
				break;
			case 2:
				System.out.print("Enter the roll number:");
				int rollnum = sc.nextInt();
				Student s1 = new Student();
				s1 = map.get(rollnum);
				s1.display();
				break;
				default:
					System.out.println("Invalid choice..\nEnter 0 to Exit.");
					break;
			}
		}
		System.out.println("Thank you..");
	}
}
