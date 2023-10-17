package com.sunbeam;
import java.util.Scanner;

public class TesterClass {
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("*****************************************************");
		System.out.println("1. Salaried Employee");
		System.out.println("2. Hourly Employee");
		System.out.println("3. Commission Employee");
		System.out.println("4. Base plus Commission Employee");
		System.out.println("5. Display all employees");
		System.out.println("0. EXIT");
		System.out.println("Enter your choice: ");
		choice = sc.nextInt();
		System.out.println("******************************************************");
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int empNum=0;
		int counter = 0;
		System.out.println("Enter the number of employees:");
		empNum=sc.nextInt();
		Employee[] employee=new Employee[empNum];
		
		
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				if (counter < empNum) {
					employee[counter]=new SalariedEmployee();
					employee[counter].acceptData();
					employee[counter].displayData();
					employee[counter].calculateSalary();
					counter++;
				} else {
					System.out.println("Number of employees are exceeded.");
				}
				break;
			case 2:
				if (counter < empNum) {
					employee[counter]=new HourlyEmployee();
					employee[counter].acceptData();
					employee[counter].displayData();
					employee[counter].calculateSalary();
					counter++;
				} else {
					System.out.println("Number of employees are exceeded.");
				}
				break;
			case 3:
				if (counter < empNum) {
					employee[counter]=new CommissionEmployee();
					employee[counter].acceptData();
					employee[counter].displayData();
					employee[counter].calculateSalary();
					counter++;
				} else {
					System.out.println("Number of employees are exceeded.");
				}
				break;
			case 4:
				if (counter < empNum) {
					employee[counter]=new BasePlusCommissionEmployee();
					employee[counter].acceptData();
					employee[counter].displayData();
					employee[counter].calculateSalary();
					counter++;
				} else {
					System.out.println("Number of employees are exceeded.");
				}
				break;
			case 5:
				for (Employee employee2 : employee)
					if (employee2 != null) {
						employee2.displayData();
					}
				break;
			case 0:
				break;
			default:
				System.out.println("Wrong choice..");
				break;
			}
		}
	}
}