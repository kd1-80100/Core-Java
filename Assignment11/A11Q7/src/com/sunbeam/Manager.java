package com.sunbeam;

public class Manager implements Employee {
	private double basicSal;
	private double dearnessAllowance;

	public Manager() {
	}

	public Manager(double basicSal, double dearnessAllowance) {
		this.basicSal = basicSal;
		this.dearnessAllowance = dearnessAllowance;
	}

	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	public double getDearnessAllowance() {
		return dearnessAllowance;
	}

	public void setDearnessAllowance(double dearnessAllowance) {
		this.dearnessAllowance = dearnessAllowance;
	}

	@Override
	public String toString() {
		return "Manager [basicSal=" + basicSal + ", dearnessAllowance=" + dearnessAllowance + "]";
	}

	@Override
	public double getSal() {
		return this.basicSal + this.dearnessAllowance;
	}

	public double calcIncentives() {
		return 0.2 * this.basicSal;
	}
}
