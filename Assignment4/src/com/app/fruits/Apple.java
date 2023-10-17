package com.app.fruits;

public class Apple extends Fruit {

	public Apple() {
		this("", 0.0, true);
	}

	public Apple(String color, double weight, boolean state) {
		super(color, weight, "Apple", state);
	}

	@Override
	public void acceptData() {
		System.out.println("Enter the details of Apple: ");
		super.acceptData();
	}

	@Override
	public void displayData() {
		super.displayData();
		this.taste();
	}

	@Override
	public String taste() {
		return "sweet n sour";
	}
}