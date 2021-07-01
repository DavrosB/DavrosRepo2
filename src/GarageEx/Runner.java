package GarageEx;

public class Runner {
	
	
	public static void main(String[] args) {
		
		Car car1 = new Car("Audi", "XYZ123", 4, "Petrol");
//		System.out.println(car1.name + car1.wheels);
		car1.setIsitfun(true);
		
		Car car2 = new Car("Ford", "YYZ146", 4, "Petrol");
//		System.out.println(car2.name + car2.wheels);
		car2.setIsitfun(true);
		
		Car car3 = new Car("ReliantRobin", "IAM SHT", 3, "Diesel");
//		System.out.println(car3.name + car3.wheels);
		car3.setIsitfun(false);
		
		
		
		motorbike bike1 = new motorbike("Yamaha", "AAA111", 2, "Petrol");
		bike1.setCc(250);
		
		
		lorry lorry1 = new lorry("Scania", "XXX123", 10, "Diesel");
		lorry1.setWeight(150);
		
	}
	
	
	

}
