package assingment.week1;

public class Truck extends Vehicle {
	private int noOfPounds;

	public Truck(int noOfPounds, int speed) {
		super(speed);
		this.noOfPounds = noOfPounds;
	}

	public void load() {
		System.out.println("Truck has " + this.noOfPounds + " loads");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		// super.move();
		System.out.println("My Truck is moving @" + this.getSpeed() + " Speed");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		// super.brake();
		System.out.println("My Truck can stop while going @" + this.getSpeed() + " Speed");
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Ford Raptor";
	}
}
