package Ferry;

public class Lorry extends Vehicle {

	public Lorry(int passenger) {
		super();
		if (passenger>2) {
			throw new IllegalArgumentException("Too many passengers");
		}
		else {
			for (int i=0; i<passenger; i++) {
				Passenger e = new Passenger(this);
				this.ph.add(e);
			}
		}
		this.space = 8;
		this.fee = 300;
		// TODO Auto-generated constructor stub
	}

}
