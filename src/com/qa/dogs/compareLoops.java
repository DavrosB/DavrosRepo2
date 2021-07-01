package com.qa.dogs;

public class compareLoops {

	public static void whileL() {

		int count = 0;
		while (count < 2) { // While Loop

			count++;
			System.out.println("This is the count for While Loop " + count);

		}

		System.out.println("Value is not less than 2");
	}

	public static void DowhileL() {

		int count = 2;
		System.out.println("This is the count so far for DoWhile   " + count);

		do { // Do While Loop
			count++;
		} while (count < 2);

	}

}
