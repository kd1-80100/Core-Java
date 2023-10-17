package exception;

import java.util.Scanner;

import exceptionapp.geometry.Point2D;

public class Circle {

	private double diameter;
	private Point2D centreOfCircle;

	public Circle() {
		this(100, 0, 0);
	}

	public Circle(double diameter, double x, double y) {
		this.diameter = diameter;
		this.centreOfCircle = new Point2D(x, y);
	}

	 void accept(Scanner sc) throws CircleException {
		System.out.println("ENTER THE DIAMETER OF CIRCLE : ");
		this.diameter = sc.nextDouble();
		if (this.diameter < 0)
			throw new CircleException("DIAMETER CANNOT BE NEGATIVE!!!");
		System.out.println("ENTER THE CO-ORDINATES FOR THE CIRCLE : ");
		System.out.print("X_AXIS :");
		double x = sc.nextDouble();
		centreOfCircle.setX(x);
		System.out.print("Y_AXIS :");
		double y = sc.nextDouble();
		centreOfCircle.setY(y);
	}

	@Override
	public String toString() {
		return "Circle [diameter=" + diameter + ", centreOfCircle=" + centreOfCircle + "]";
	}

	 
}