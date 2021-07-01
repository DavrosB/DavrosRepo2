package taxes2;

public class taxesEx {
//	Create the tax class, it contains 2 methods.
//
//	Method 1 - which takes a salary and works out the percentage by which the salary will be taxed.
//
//	Method 2 - which works out the exact amount that the user will be taxed using a similar process to that in the first method. That amount should be returned and output to the console.
//
//	These 2 methods should be able to work independently, so it is fine in this case if some of the code is repeated.*
//
//	The salaries are taxed as below:
//
//	0 - 14,999 : 0% tax
//	15,000 - 19,999 : 10% tax
//	20,000 - 29,999 : 15% tax
//	30,000 - 44,999 : 20% tax
//	45,000+ : 25% tax
//	Finally combine the 2 methods so that the second method utilizes the first method to return the correct result.

//	need to use AND = &&  and OR 2 =  ¦¦  ctrl alt and top left key

	public static int taxcalc(int salary) {
		//apply conditions to check which tax band
		
		int tax=0;
		
		if (salary>45000) { 
			System.out.println("Tax band is 25%");
			tax = 25;
		}
		else if (salary <= 45000 && salary >= 30000) {
			System.out.println("Tax band is 20%");
			tax = 20;
		}
		else if (salary < 30000 && salary >= 20000) {
			System.out.println("Tax band is 15%");
			tax = 15;
		}
		else if (salary < 20000 && salary >= 15000) {
			System.out.println("Tax band is 10%");
			tax = 10;
		}
		else	
		{
			System.out.println("Tax is 0%");
		}
		return tax;
			
	}

}
