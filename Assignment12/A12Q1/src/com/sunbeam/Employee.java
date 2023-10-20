package com.sunbeam;

public interface Employee {
	double getSal();

	default double calcIncentives() {
		return 0.0;
	}

	static double calcTotalIncome(Employee arr[]) {
		double totalSalary = 0.0;
		for (Employee e : arr) {
			//double salary = e.getSal();
			totalSalary = totalSalary+e.getSal() + e.calcIncentives();
		}
		return totalSalary;
	}
}
