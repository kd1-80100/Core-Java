package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
	private int id;
	private String name;

	public Employee() {
	}
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee id:");
		id = sc.nextInt();
		System.out.println("Enter the employee name:");
		name = sc.next();
	}

	public void displayData() {
		System.out.println("Employee id:" + this.id);
		System.out.println("Name of Employee:" + this.name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
