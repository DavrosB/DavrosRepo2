package GarageEx2;

public class Lorry extends Vehicle {
	
//	variable
	private boolean cab;

	
//	add constructor
	public Lorry() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lorry(boolean cab, String colour, int wheels) {
		super(colour, wheels);
		this.cab = cab;
		// TODO Auto-generated constructor stub
	}

	
//	generate getters and setters
	public boolean isCab() {
		return cab;
	}

	public void setCab(boolean cab) {
		this.cab = cab;
	}

	
	
	@Override
	public String toString() {
		return "Lorry [cab=" + cab + "," + super.toString() + "]";
	}
	
	
	
	

}
