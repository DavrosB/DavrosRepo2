
public class Arrays {

	public static void ArrayEx() {

		String[] names = { "Bob", "Mickey", "John" };

		int age[] = { 24, 25, 37 };

		String[][] names2 = { { "dave", "brian", "rachel", "lucy", "ozzy" }, { "jim", "bob", "pete", "tam", "robin" },
				{ "alex", "alison", "paul", "beth", "ethan" } };

		System.out.println(names[1] + age[2]);
		System.out.println(names2[0][2] + names2[1][1]);
	}

	public static void ArrayEx2() {
		;

//	Create an array that will hold 10 integer values,
//populate the array with values, then call and output each element.

		int[] Num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// System.out.println("First number " + Num[0] + "Second number is " + Num[1] + "Third number is " + Num[2] + "Fourth number is " + Num[3] + "Fifth number is " + Num[4] + "Sixth number is " + Num[5]+ "Seventh number is " + Num[6] + "Eighth number is " + Num[7] + "Ninth number is " + Num[8] + "Tenth number is " + Num[9]);
		int i = 0;
		for (int times=0; times<Num.length; times++) {
			System.out.println(("The number times 10 is " + Num[i]*10));
			i++;	
		}
			
	
//	Create a for loop that populates an integer array with values, 
//		outputting them at each iteration.
//		Then create another loop that iterates through the array, changing 
//		the values at each point to equal itself times 10, outputting them at each iteration.
		
		
		

	}

}
