package Ferry;

public class Passenger {
	
	private int fee = 25;
	private Vehicle vehicle = null;
	public Passenger() {

	}
	public Passenger(Vehicle vehicle) {
		this.vehicle = vehicle;
		setFee();
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	private void setFee() {
		if (vehicle instanceof Car) {
			this.fee = 20;
		}
		if (vehicle instanceof Lorry) {
			this.fee = 20;
		}
		if (vehicle instanceof Bus) {
			this.fee = 15;
		}
		if (vehicle instanceof Bicycle) {
			this.fee = 0;
		}
	}
	
	
}
