package com.sunbeam;
import java.util.Scanner;

/*
 Create an application that calculates your daily driving cost, so that you can estimate how much
money could be saved by car pooling, which also has other advantages such as reducing carbon
emmission and reducing traffic congestion. The application should input the following information
and display the user’s cost per day of driving to work:
a) Total miles driven per day.
b) Cost per gallon of gasoline.
c) Average miles per gallon.
d) Parking fees per day.
e) Tolls per day.
 */
public class Car {
	double distance;	//Total miles driven per day
	double cost;	//Cost per gallon of gasoline
	double avg;	//Average miles per gallon
	double pFees;	//Parking fees per day
	double tCharges;	//Toll charges per day
	
	public Car(double distance, double cost, double avg, double pFees, double tCharges) {
		super();
		this.distance = distance;
		this.cost = cost;
		this.avg = avg;
		this.pFees = pFees;
		this.tCharges = tCharges;
	}

	public Car() {
		this.distance = 0;
		this.cost = 0;
		this.avg = 0;
		this.pFees = 0;
		this.tCharges = 0;
	}
	
	public void acceptData() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the distance of company in miles:");
		distance=sc.nextDouble();
		System.out.print("Enter the cost of gasoline per gallon:");
		cost=sc.nextDouble();
		System.out.print("Enter the average:");
		avg=sc.nextDouble();
		System.out.print("Enter the parking fees per day:");
		pFees=sc.nextDouble();
		System.out.print("Enter the toll charges per day:");
		tCharges=sc.nextDouble();
		sc.close();
	}
	public void DisplayData() {
		System.out.println("distance of company in miles:"+distance);
		System.out.println("cost of gasoline per gallon:"+cost);
		System.out.println("average:"+avg);
		System.out.println("parking fees per day:"+pFees);
		System.out.println("toll charges per day:"+tCharges);
	}
	public void drivingCost() {
		double drivingCost=((cost/avg)*distance)+pFees+tCharges;
		System.out.println("Total driving cost:"+drivingCost);
	}
}
