package com.qa.calc;

public class calc1 {

//	Calculator Exercise

	public static int add(int a, int b) {
	
		
		int c = a + b;
		return c;
		
	
		}
	

	public static int sub(int a, int b) {
		int c = a - b;
		return c;
	}

	public static int mult(int a, int b) {
		int c = a * b;
		return c;
	}

	public static double div(double a, double b) {
//		add condition of divide as per QA book
		double c = 0.0;

		if (a > b) {
			c = a / b;
		}

		else {
			System.out.println("Division can't be done");
		}

		return c;

	}

//		Modulus operator = %
//		eg 5%2 returns the remainder - in this case 1

	public static int modulus(int a) {
		int c = a % 2;

		if (c == 0) {
			System.out.println("The number is even");
		} else {
			System.out.println("The numbers is odd");
		}
		return c;
	}

//	ctrl + shift + f	Format the class

}
