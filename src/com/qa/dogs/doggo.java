package com.qa.dogs;

public class doggo { // a

	public static void whileloop() { // b
		System.out.println("This is the While example");

		int dogs = 0;
		boolean NotEnoughDogs = true;

		while (NotEnoughDogs) {// c

			// sysout ctrl and space

			System.out.println("Gimme dog");
			dogs++;
			System.out.println("Dogs = " + dogs);
			if (dogs >= 5) { // d
				NotEnoughDogs = false;
			} // d
		} // c

	}// b

	public static void DoWhileLoop() {
		System.out.println("Theis is the DoWhile example");
		int dogs = 0;
		boolean NotEnoughDogs = true;
		do {

			System.out.println("Gimme dogs");
			dogs++;
			System.out.println("Dogs = " + dogs);
			if (dogs == 5) {
				NotEnoughDogs = false;
			}
		} while (NotEnoughDogs);

	}

} // a
