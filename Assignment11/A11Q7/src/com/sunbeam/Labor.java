package com.sunbeam;

public class Labor implements Employee {
	private double hours;
	private double rate;

	public Labor() {
		// TODO Auto-generated constructor stub
	}

	public Labor(double hours, double rate) {
		this.hours = hours;
		this.rate = rate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Labor [hours=" + hours + ", rate=" + rate + "]";
	}

	@Override
	public double getSal() {
		return this.getHours() * this.getRate();
	}

	public double calcIncentives() {
		if (this.getHours() > 300) {
			return 0.05 * this.getSal();
		} else
			return 0.0;
	}
}
