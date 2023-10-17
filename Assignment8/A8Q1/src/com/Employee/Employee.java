package com.Employee;

import java.util.Scanner;

public class Employee {
	private String fName;
	private String lName;
	private int ssn;

	public Employee(String fName, String lName, int ssn) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.ssn = ssn;
	}

	public Employee() {
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name:");
		fName = sc.next();
		System.out.println("Enter the last name:");
		lName = sc.next();
		System.out.println("Enter the social security number:");
		ssn = sc.nextInt();
	}

	public void displayData() {
		System.out.println("Name of Employee:" + this.fName + " " + this.lName);
		System.out.println("Social security number:" + this.ssn);
	}

	public void calculateSalary() {
	}

	@Override
	public String toString() {
		return "Employee [fName=" + fName + ", lName=" + lName + ", ssn=" + ssn + "]";
	}

}