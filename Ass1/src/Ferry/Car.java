package Ferry;
public class Car extends Vehicle {


	public Car(int passengers) {
		super();
		if (this.ph.size()>4) {
			throw new IllegalArgumentException("Too many passengers");
		}
		else {
			for (int i=0; i<passengers; i++) {
				Passenger e = new Passenger(this);
				this.ph.add(e);
			}
		}
		this.space = 1;
		this.fee = 100;
		// TODO Auto-generated constructor stub
	}

}
