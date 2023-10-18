package com.sunbeam;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Employee> llist = new LinkedList<Employee>();
		int choice;
		do {
			System.out.println("****FUNCTIONS****");
			System.out.println("0. Exit");
			System.out.println("1. Add Employee");
			System.out.println("2. Delete Employee");
			System.out.println("3. Find Employee");
			System.out.println("4. Sort Employee");
			System.out.println("5. Edit Employee");
			System.out.println("Enter your choice:");
			System.out.println("******************************");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Employee e = new Employee();
				e.acceptData();
				llist.add(e);
				break;
			case 2:
				llist.remove();
				System.out.println("Employee deleted");
				break;
			case 3:
				System.out.println("Enter the employee id:");
				int id = sc.nextInt();
				Employee e1 = new Employee();
				e1.setId(id);
				int index = llist.indexOf(e1);
				if(!(llist.indexOf(e1)== -1))
					System.out.println("Employee found at index " + llist.indexOf(e1));
				else
					System.out.println("Employee is not in the list");
				break;
			case 4: {
				class EmployeeComparator implements Comparator<Employee> {
					@Override
					public int compare(Employee e1, Employee e2) {
						int diff = e1.getName().compareTo(e2.getName());
						return diff;
					}
				}
				EmployeeComparator cmp=new EmployeeComparator();
				llist.sort(cmp);
				for (Employee ele : llist) {
					System.out.println(ele);
				}
			}
			break;
			case 5:
				System.out.println("Enter the employee id to modify:");
				int id1=sc.nextInt();
				Employee e3=new Employee();
				e3.setId(id1);
				int index1=llist.indexOf(e3);
				if (index1==-1) {
					System.out.println("Employee not found.");
				} else {
					Employee oldEmp=llist.get(index1);
					System.out.println("Employee found:"+oldEmp);
					System.out.println("Enter new information for the Employee:");
					Employee newEmp=new Employee();
					newEmp.acceptData();
					llist.set(index1, newEmp);
				}
				break;
			}
		} while (choice != 0);
	}
}
