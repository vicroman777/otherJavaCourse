package Ferry;

public class Bus extends Vehicle {

	public Bus(int passenger) {
		super();
		if (passenger>20) {
			throw new IllegalArgumentException("Too many passengers");
		}
		else {
			for (int i=0; i<passenger; i++) {
				Passenger e = new Passenger(this);
				this.ph.add(e);
			}
		}
		this.space = 4;
		this.fee = 200;
		// TODO Auto-generated constructor stub
		
	}

}
