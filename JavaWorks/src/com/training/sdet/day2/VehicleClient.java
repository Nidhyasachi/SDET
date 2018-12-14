package com.training.sdet.day2;

public class VehicleClient {

	public static void display(Vehicle v) {
		System.out.println("---------------------------------");
		v.move();
		v.brake();
		if (v instanceof Car) {
			((Car) v).doors();
			((Car) v).fuelCapacity();
		} else if (v instanceof Truck) {
			((Truck) v).load();
		}
	}

	public static void main(String[] args) {
		// singleObjectCall();

		Vehicle[] v = new Vehicle[4];

		v[0] = new Car(4, 40, 100);
		v[1] = new Truck(3000, 85);
		v[2] = new Car(2, 35, 130);
		v[3] = new Truck(4000, 95);

		/*
		 * for(int i=0; i<v.length ; i++){ display(v[i]); }
		 */

		for (Vehicle temp : v) {
			display(temp);
		}
	}

	/*
	 * public static void main(String[] args) { Vehicle v = new Car(2,35,120);
	 * System.out.println("####Display Vehicle.Car####"); display(v);
	 * 
	 * v = new Truck(4000,75); System.out.println(
	 * "####Display Vehicle.Truck####"); display(v); }
	 */
}
