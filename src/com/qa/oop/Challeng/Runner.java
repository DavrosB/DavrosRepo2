package com.qa.oop.Challeng;

import java.util.ArrayList;

public class Runner {
	
	public static void main(String[] args) {
		
		
		Customer dave = new Customer("Dave", 40, "Blagger");//object
		Customer fred = new Customer("Fred", 50, "Joiner");//object
		Customer jim = new Customer("Jamesy", 45, "PornStar");//object
		
		System.out.println(dave.toString());
		
		ArrayList<Customer> people = new ArrayList<>();
		people.add(fred);
		people.add(dave);
		people.add(jim);
		
		System.out.println(people);
	}
	


}
