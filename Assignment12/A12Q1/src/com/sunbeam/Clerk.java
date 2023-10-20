package com.sunbeam;

public class Clerk implements Employee {
	private double salary;

	public Clerk() {
		// TODO Auto-generated constructor stub
	}

	public Clerk(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Clerk [salary=" + salary + "]";
	}

	@Override
	public double getSal() {
		return this.salary;
	}

}
