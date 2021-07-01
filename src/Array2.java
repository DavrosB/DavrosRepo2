import java.util.ArrayList;

public class Array2 {

	public static void arraylist() {

		ArrayList<Integer> age = new ArrayList<>();
		age.add(25);
		age.add(25);
		age.add(25);
		age.add(25);
		System.out.println(age.size());

	}

	public static void arraylist2() {

		ArrayList<String> cars = new ArrayList<>();
		cars.add("Ford"); // index 0  
		cars.add("Honda"); // index 1  Index 0 after remove
		cars.add("Ferrari"); // index 2  Index 1 after remove
		cars.add("Vauxhall");   // Index 3  Index 2 after remove
		//cars.remove(0); //removes 1st Ford at Index 0
		//cars.clear(); // removes everything
		
		//cars.get(1); //returns whatever is at Index point specified
		
		
		System.out.println("First car is " + cars.get(0) );
		System.out.println("Second car is " + cars.get(1) );
		System.out.println("Third car is " + cars.get(2) );
		System.out.println("Fourth car is " + cars.get(3) );
		
		
		//int i = 0;
		for (int i=0; i < cars.size(); i++) {
			System.out.println(("First car " + cars.get(i)));
			//i++;	
			
			
		}

	}

}
