package com.sunbeam;

public class Test {
	public static void main(String[] args) {
		Manager m = new Manager(40000, 5000);
		System.out.println("Manager Details:");
		System.out.println("Salary:" + m.getSal());
		System.out.println("Incentive:" + m.calcIncentives());

		System.out.println("\nClerk Details:");
		Clerk c = new Clerk(25000);
		System.out.println("Salary:" + c.getSal());
		System.out.println("Incentive:" + c.calcIncentives());

		System.out.println("\nLabor Details:");
		Labor l = new Labor(9, 200);
		System.out.println("Salary:" + l.getSal());
		System.out.println("Incentive:" + l.calcIncentives());

		Employee[] arr = new Employee[3];
		arr[0] = new Manager(40000, 5000);
		arr[1] = new Clerk(25000);
		arr[2] = new Labor(9,200);
		double totalSalary = Employee.calcTotalIncome(arr);
		System.out.println("\nTotal Salary of all employees:" + totalSalary);
	}
}
