package com.Employee.Test;

import com.Employee.BasePlusCommissionEmployee;
import com.Employee.CommissionEmployee;
import com.Employee.Employee;
import com.Employee.HourlyEmployee;
import com.Employee.SalariedEmployee;

class Box<T extends Employee> {
	private T obj;

//	public Box() {
//		this.obj=null;
//	}
//	public Box(T obj) {
//		this.obj=obj;
//	}
	public void set(T val) {
		this.obj = val;
	}

	public T get() {
		this.obj.calculateSalary();
		return this.obj;
	}

}

public class Test {
	public static void main(String[] args) {
		BasePlusCommissionEmployee b1 = new BasePlusCommissionEmployee();
		b1.acceptData();
		b1.displayData();
		
		Box<BasePlusCommissionEmployee> e1 = new Box<BasePlusCommissionEmployee>();
		e1.set(b1);
//		System.out.println(b1.toString());
		b1.calculateSalary();
		
		CommissionEmployee b2 = new CommissionEmployee();
		b2.acceptData();
		b2.displayData();
		Box<CommissionEmployee> e2 = new Box<CommissionEmployee>();
		e2.set(b2);
//		System.out.println(b2.toString());
		b2.calculateSalary();
		
		HourlyEmployee b3=new HourlyEmployee();
		b3.acceptData();
		b3.displayData();
		Box<HourlyEmployee> e3 = new Box<HourlyEmployee>();
		e3.set(b3);
//		System.out.println(b3.toString());
		b3.calculateSalary();
		
		SalariedEmployee b4=new SalariedEmployee();
		b4.acceptData();
		b4.displayData();
		Box<SalariedEmployee> e4=new Box<SalariedEmployee>();
		e4.set(b4);
//		System.out.println(b4.toString());
		b4.calculateSalary();
	}

}
