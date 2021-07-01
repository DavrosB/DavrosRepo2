package qa.com.loops;

public class QAExamples {

	public static void flow1() {

		int A = 100;
		while (A <= 200) {
			System.out.println("The value of A is " + A);
			A++;
		}
		System.out.println("A has reached " + A + "  we've reached the end");
	}

	
	
	
	public static int numrep() {

		int times = 1;
		int count=1;
		int num = 1;
		boolean go = true;

		do {

			if (times <= 10) {
				
				
//				loop and print each number 10 times
				for (count = 1; count <= 10; count++) {
					System.out.println(num);
					
					
				}
				
			  num++; //add 1 to the number
			  times++;
			  
			} 
			
			else {
				go = false; //set go condition to false
			}
			
		} while (go);

		System.out.println("I've stopped " + "Times = " + times + "count =" + count + "number is " + num + go);
		return count;

	}
	
	
	public static int numrep2() {

		int times = 1;
		int count=1;
		int num = 1;
		boolean go = true;

		do {

			if (times <= 10) {
				
				
//				loop and print each number 10 times
				for (count = 1; count <= num; count++) {
					System.out.println(num);
					
					
				}
				
			  num++; //add 1 to the number
			  times++;
			  
			} 
			
			else {
				go = false; //set go condition to false
			}
			
		} while (go);

		System.out.println("I've stopped " + "Times = " + times + "count =" + count + "number is " + num + go);
		return count;

	}
	
	
	
	
}
