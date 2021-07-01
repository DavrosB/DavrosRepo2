package com.qa.Switchcases;

public class days {

	public static String DaysofWeek(String today) {

		switch (today) {

		case "Monday":
			System.out.println("I don't like Mondays");
			break;
		case "Tuesday":
			System.out.println("Suicide Tuesday");
			break;
		case "Wednesday":
			System.out.println("Hump Day");
			break;
		case "Thursday":
			System.out.println("Almost the weekend");
			break;
		case "Friday":

			System.out.println("Its Friiiiiidaaaaay!!!");
			break;
		case "Saturday":
			System.out.println("Saturday play....");
			break;
		case "Sunday":
			System.out.println("Sunday never comes to play");
			break;

		}
		return null;
	}
}