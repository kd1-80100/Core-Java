package com.app.fruits;

public class Mango extends Fruit {

	public Mango() {
		this("", 0.0, true);
	}

	public Mango(String color, double weight, boolean state) {
		super(color, weight, "Mango", state);
	}

	public void acceptData() {
		System.out.println("Please enter the details of Mango:");
		super.acceptData();
	}

	public void displayData() {
		super.displayData();
		this.taste();
	}

	public String taste() {
		return "sweet";
	}
}