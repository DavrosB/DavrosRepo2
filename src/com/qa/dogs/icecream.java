package com.qa.dogs;

public class icecream { // 1

	public static void whileloop2() { // 2

		int ices = 0;
		boolean Eaten = true;

		while (Eaten) { // 3S

			System.out.println("Have another ice cream");
			ices++;
			System.out.println("You've eaten " + ices + " so far!");

			if (ices == 10) { // 4
				System.out.println("You've eaten enough now fat boy!");
				Eaten = false;

			} // 4

		} // 3
	} // 2

} // 1
