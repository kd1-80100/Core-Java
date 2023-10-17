package com.app.geometry;

public class Point2D {
	double x, y;

	public Point2D(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public String getDetails() {
		String a = "X axis coordinate:" + x + "\tY axis coordinate:" + y;
		return a;
	}

	public boolean isEqual(Point2D otherPt) {
		return this.x == otherPt.x && this.y == otherPt.y;
	}

	public double calculateDistance(Point2D otherPt) {
		double dx = this.x - otherPt.x;
		double dy = this.y - otherPt.y;
		return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	}
}
