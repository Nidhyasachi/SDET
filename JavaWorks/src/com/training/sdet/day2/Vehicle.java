package com.training.sdet.day2;

public class Vehicle {
	private int speed;

	public Vehicle(int speed) {
		this.speed = speed;
	}

	public void move() {
		System.out.println("Vehicle can move @" + this.speed);
	}

	public void brake() {
		System.out.println("Vehicle can stop");
	}

	protected int getSpeed() {
		return speed;
	}

}
