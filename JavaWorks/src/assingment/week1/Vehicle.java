package assingment.week1;

public abstract class Vehicle {
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
	public abstract String getType();
}
