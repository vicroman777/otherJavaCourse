package Ferry;

public class Bicycle extends Vehicle {

	public Bicycle() {
		// TODO Auto-generated constructor stub
		super();
		this.space = 0.5;
		Passenger e = new Passenger(this);
		this.ph.add(e);
		this.fee = 40;
		
	}

}
