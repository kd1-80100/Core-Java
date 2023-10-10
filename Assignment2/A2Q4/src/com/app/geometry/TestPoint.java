package com.app.geometry;

import java.util.Scanner;

public class TestPoint {
	public static void main(String[] args) {
		double x, y;
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the coordinates of x axis:");
		x=sc.nextDouble();
		System.out.print("Enter the coordinates of y axis:");
		y=sc.nextDouble();
		Point2D p1=new Point2D(x, y);
		System.out.print("Enter the coordinates of x axis:");
		x=sc.nextDouble();
		System.out.print("Enter the coordinates of y axis:");
		y=sc.nextDouble();
		Point2D p2=new Point2D(x, y);
		s=p1.getDetails();
		System.out.println(s);
		if (p1.isEqual(p2)) {
			System.out.println("Point p1 and p2 are equal.");
		} else {
			System.out.println("Point p1 and p2 are not equal.");
		}
		double distance=p1.calculateDistance(p2);
		System.out.println("Distance between point p1 & p2 is:"+distance);
		sc.close();
	}
}