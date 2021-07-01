package GarageEx;

public class motorbike extends Vehicle{

		
		int cc;

		public motorbike(String name, String reg, int wheels, String fuel, int cc) {
			super(name, reg, wheels, fuel);
			// TODO Auto-generated constructor stub
			this.cc = cc;
		}

		public int getCc() {
			return cc;
		}

		public void setCc(int cc) {
			this.cc = cc;
		}
	
	

}
