package GarageEx;

public class lorry extends Vehicle {

		
		private int weight;

		public lorry(String name, String reg, int wheels, String fuel, int weight) {
			super(name, reg, wheels, fuel);
			// TODO Auto-generated constructor stub
			this.weight=weight;
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}
		
		
		
		
		

}
