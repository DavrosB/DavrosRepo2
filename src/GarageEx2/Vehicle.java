package GarageEx2;

public abstract class Vehicle {

//	declare variables
	private String colour;
	private int wheels;

	// constructor

	public Vehicle(String colour, int wheels) {
		super();
		this.colour = colour;
		this.wheels = wheels;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

//	Getters and Setters
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

//	Generate toString right click ->source-> generate toString
	@Override
	public String toString() {
		return "Vehicle [colour=" + colour + ", wheels=" + wheels + "]";
	}

}
