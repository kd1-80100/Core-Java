package com.app.fruits;

public class Orange extends Fruit {

	public Orange() {
		this("", 0.0, true);
	}

	public Orange(String color, double weight, boolean state) {
		super(color, weight, "Orange", state);
	}

	@Override
	public void acceptData() {
		System.out.println("Enter the details of Orange:");
		super.acceptData();
	}

	@Override
	public void displayData() {
		super.displayData();
		this.taste();
	}

	public String taste() {
		return "sour";
	}
}