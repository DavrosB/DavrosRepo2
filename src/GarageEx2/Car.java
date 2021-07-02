package GarageEx2;

public class Car extends Vehicle {

//	variables

	private boolean wipers;

//	constructor	
	public Car() { // empty constructor required to cover unforeseen scenarios
		super(); // best practice to create an empty constructor
	}

	public Car(String colour, int wheels, boolean wipers) {
		super(colour, wheels);
		this.wipers = wipers;
	}

//	add getters and setters
	public boolean isWipers() {
		return wipers;
	}

	public void setWipers(boolean wipers) {
		this.wipers = wipers;
	}

//	generate toString
	@Override
	public String toString() {
		return "Car [wipers=" + wipers + "," + super.toString() + "]";
	}

}
