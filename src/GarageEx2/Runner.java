package GarageEx2;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		create vehicles

		Car car1 = new Car("Red", 4, true);
		Car car2 = new Car("White", 4, true);
		Car car3 = new Car("Blue", 4, true);
		Motorbike bike1 = new Motorbike("Yellow", 2, true);
		Lorry lorry1 = new Lorry(true, "Orange", 18);

//		create garage

		Garage garage1 = new Garage();

//		add vehicles to garage

		garage1.addVehicle(car1);
		garage1.addVehicle(car2);
		garage1.addVehicle(car3);
		garage1.addVehicle(bike1);
		garage1.addVehicle(lorry1);
		garage1.removeByID(3);
		garage1.removeByType("Motorbike");

//		print the array of vehicles added

		garage1.printGarage();

//		Vehicle Loop
		garage1.vehicleLoop();

//		remove by type has error when we run it
//		garage1.removeByType("Lorry");

//		fix by ID
		garage1.fixByID(1);
		
		
//		empty garage
		garage1.emptyGarage();
		garage1.printGarage();

	}

}
