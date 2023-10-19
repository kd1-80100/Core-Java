package com.sunbeam;

import java.util.Scanner;

public class Student {
	private int rollNo;
	private String name;

	public Student() {
	}

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the roll number:");
		rollNo = sc.nextInt();
		System.out.print("Enter the name:");
		name = sc.next();
	}

	public void display() {
		System.out.println("Roll number:" + this.rollNo);
		System.out.println("Name:" + this.name);
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
}
