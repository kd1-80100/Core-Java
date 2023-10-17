package com.Employee;
/*Copy Person class and inherited classes (Employee, Salesman, Manager, SalesManager) 
 * from previous assignment/classwork. Implement generic class Box so that it can 
 * store any Person in it. How to get total salary of the Employee in Box?
*/

import java.util.Scanner;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	double baseSalary;

	public BasePlusCommissionEmployee(String fName, String lName, int ssn, double grossSale, double commissionRate,
			double baseSalary) {
		super(fName, lName, ssn, grossSale, commissionRate);
		this.baseSalary = baseSalary;
	}

	public BasePlusCommissionEmployee() {
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		super.acceptData();
		System.out.println("Enter the base salary:");
		this.baseSalary = sc.nextDouble();
	}

	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Base Salary:" + this.baseSalary);
	}

	@Override
	public void calculateSalary() {
		System.out.println("Employee Salary:" + ((this.commissionRate * this.grossSale) + this.baseSalary));
	}

	@Override
	public String toString() {
		return "BasePlusCommissionEmployee [baseSalary=" + baseSalary + "]";
	}
}