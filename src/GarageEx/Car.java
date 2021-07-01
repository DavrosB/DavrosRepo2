package GarageEx;

public class Car extends Vehicle {

	boolean isitfun;

	public Car(String name, String reg, int wheels, String fuel, boolean isitfun) {
		super(name, reg, wheels, fuel);
		this.isitfun = isitfun;
		// TODO Auto-generated constructor stub
	}

	public boolean isIsitfun() {
		return isitfun;
	}

	public void setIsitfun(boolean isitfun) {
		this.isitfun = isitfun;
	}

}