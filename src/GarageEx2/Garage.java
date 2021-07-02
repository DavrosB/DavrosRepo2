package GarageEx2;

//import java utilities - java List and ArrayList - click on error and import
import java.util.ArrayList;
import java.util.List;

public class Garage {

//	create new empty List = constructor of ArrayList
	private List<Vehicle> vehicles = new ArrayList<>();

	// Generate empty constructor with no fields
	public Garage() {
		super();
	}

//	create method to iterate through List
	public void vehicleLoop() {

//	set variable for bill
		int bill = 0;

//	loop while the list has values
		for (Vehicle i : this.vehicles) {

			if (i.getClass().getSimpleName().equals("Car")) {
				bill += 200;
			}

			else if (i.getClass().getSimpleName().equals("Motorbike")) {
				bill += 100;
			}

			else if (i.getClass().getSimpleName().equals("Lorry")) {
				bill += 1000;
			}

		}

//		this calculates the bill
		System.out.println("Bill: £" + bill);
	}

	// add and remove the vehicles to the list - this answers Q4 in the challenge

	public void addVehicle(Vehicle a) {
		this.vehicles.add(a);

	}

	public void removeVehicle(Vehicle b) {
		this.vehicles.remove(b);

	}

//	empty the garage
	public void emptyGarage() {
		this.vehicles.clear();
		System.out.println("The garage is empty");
	}

	public void removeByID(int id) {

		this.vehicles.remove(id);
		System.out.println("We removed the vehicle " + this.vehicles.get(id));

	}
// Method to remove a vehicle by type until it reaches the end of the array

	public void removeByType(String type) {

		for (Vehicle count : this.vehicles) {

			if (count.getClass().getSimpleName().equals(type)) {

				this.vehicles.remove(count);

			}

		}

	}

	public void fixByID(int Id) {

//		vehicles{Id]
		int bill = 0;

		if (this.vehicles.get(Id).getClass().getSimpleName().equals("Car")) {
			bill += 200;
		}

		else if (this.vehicles.get(Id).getClass().getSimpleName().equals("Motorbike")) {
			bill += 100;
		}

		else if (this.vehicles.get(Id).getClass().getSimpleName().equals("Lorry")) {
			bill += 1000;
		}
		System.out.println("Bill: £" + bill);
	}

	
	public void printGarage() {
		System.out.println(this.vehicles);
		
		
	}
	
	
	
}
