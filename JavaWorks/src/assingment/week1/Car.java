package assingment.week1;

public class Car extends Vehicle {
	private int doors;
	private int capacity;
	
	public Car(int doors, int capacity,int speed) {
		super(speed);
		this.doors = doors;
		this.capacity = capacity;
		}

	public void doors() {
		System.out.println("My Car has " + this.doors + " doors");
	}

	// Method
	public void fuelCapacity() {
		System.out.println("Car has " + this.capacity + " ltrs of capacity");
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		// super.move();
		System.out.println("My Car is moving @" + this.getSpeed() + " Speed");
	}
	@Override
	public void brake() {
		// TODO Auto-generated method stub
		// super.brake();
		System.out.println("My Car can stop while going @" + this.getSpeed() + " Speed");
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Honda Odyssey";
	}

}
