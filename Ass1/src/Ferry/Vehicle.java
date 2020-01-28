package Ferry;
import java.util.ArrayList;

public abstract class Vehicle {

	protected double space = 0;
	protected ArrayList<Passenger> ph = new ArrayList<Passenger>();
	protected int fee = 0;
	
	public Vehicle() {
		super();
	}
	public double getSpace() {
		return space;
	}
	public void setSpace(double space) {
		this.space = space;
	}
	
	public ArrayList<Passenger> getPh() {
		return ph;
	}

	public void setPh(ArrayList<Passenger> ph) {
		this.ph = ph;
	}

	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
			
	
}
