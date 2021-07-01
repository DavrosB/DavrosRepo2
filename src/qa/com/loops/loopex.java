package qa.com.loops;

public class loopex {

	public static void hello() {

		for (int count = 0; count < 3; count++) {

			System.out.println("hello");

		}

	}

	public static void timesTable(int num) {

		for (int count = 1; count <= 10; count++) {
			int out = num * count;
			System.out.println(num + " x " + count + " = " + out);

		}
	}
	
	
	public static void timesTable2(int num) {

		for (int count = 1; count <= num; count++) {
			int out = num * count;
			System.out.println(num + " x " + count + " = " + out);

		}
	}
	
	
	
}


