package com.sunbeam;

import java.util.Scanner;

public class Date implements Displayable {
	int day;
	int month;
	int year;
	
	

	public Date() {
		this(16,2,2000);
	}


	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}


	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}


	public void acceptData() {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Inside Date acceptDate()");	
		System.out.print("day :");
		this.day=sc.nextInt();
		System.out.print("month :");
		this.month=sc.nextInt();
		System.out.print("year :");
		this.year=sc.nextInt();
	}
	

	@Override
	public void DisplayData() {
		System.out.println("DATE : " + this.day + "/" + this.month+"/"+this.year);

	}
	}