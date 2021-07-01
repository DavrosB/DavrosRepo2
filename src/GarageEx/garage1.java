package GarageEx;

import java.util.ArrayList;
import java.util.List;

public class garage1 {
	

	Car car1 = new Car("Audi", "XYZ123", 4, "Petrol", true);
//	System.out.println(car1.name + car1.wheels);
	

	Car car2 = new Car("Ford", "YYZ146", 4, "Petrol", true);
//	System.out.println(car2.name + car2.wheels);
	

	Car car3 = new Car("ReliantRobin", "IAM SHT", 3, "Diesel", false);
//	System.out.println(car3.name + car3.wheels);


	motorbike bike1 = new motorbike("Yamaha", "AAA111", 2, "Petrol", 250);
	

	lorry lorry1 = new lorry("Scania", "XXX123", 10, "Diesel", 10);
	
	
//	Using a List implementation, store all your vehicles in a Garage class.
	
//	adding vehicles into garage
	List<Vehicle> wackyList = new ArrayList<>();
	
	public void addVehicle() {
		wackyList.add(car1);
		wackyList.add(car2);
		wackyList.add(car3);
		wackyList.add(bike1);
		wackyList.add(lorry1);
		
		
//	add dynamic vehicle into list
//	create bill for vehicles
		
	
	}
	
	
	

}
