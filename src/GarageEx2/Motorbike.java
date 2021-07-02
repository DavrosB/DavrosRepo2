package GarageEx2;

public class Motorbike extends Vehicle  {
	
	private boolean handlebars;



//	add constructor using fields
//	Method has Arguments passed into it via colour/ wheels/handlebars
	public Motorbike(String colour, int wheels, boolean handlebars) {
		super(colour, wheels);
		this.handlebars = handlebars;
	}
	
	public Motorbike() {  //empty constructor required to cover unforeseen scenarios
		super();    //best practice to create an empty constructor
	}


//	add getters and setters
	public boolean isHandlebars() {
		return handlebars;
	}

	public void setHandlebars(boolean handlebars) {
		this.handlebars = handlebars;
	}

	
//	add toString
@Override
public String toString() {
	return "Motorbike [handlebars=" + handlebars + "," + super.toString() + "]";
	
	
}
	



}
