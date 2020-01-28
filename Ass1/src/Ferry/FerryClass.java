package Ferry;
import java.util.ArrayList;

public class FerryClass implements Ferry {

	private final int maxPassengers = 200;
	private final int maxCars = 40;
	private int currentPass = 0;
	private int currentVeh = 0;
	private int totalMoney = 0;
	private ArrayList<Vehicle> vh = new ArrayList<Vehicle>();
	private ArrayList<Passenger> ph = new ArrayList<Passenger>();

	@Override
	public int countPassengers() {
		int total = 0; 
		for(Passenger p:ph) {
			total++;
		}
		return total;
	}

	@Override
	public int countVehicleSpace() {
		int total = 0; 
		for(Vehicle v:vh) {
			total++;
		}
		return total;
	}

	@Override
	public int countMoney() {
		// TODO Auto-generated method stub
		for (Passenger p:ph) {
			totalMoney += p.getFee();
		}
		for (Vehicle v:vh) {
			totalMoney += v.getFee();
		}
		return totalMoney;
	}

	@Override
	public Vehicle[] getAllVehicles() {
		// TODO Auto-generated method stub
		
		Vehicle[] toArray = vh.toArray(new Vehicle[vh.size()]);
		return toArray;
	}

	@Override
	public void embark(Vehicle v) {
		if (!hasSpaceFor(v)) {throw new IllegalArgumentException("no space");}
		else {
		vh.add(v);
		currentVeh += v.space;
		currentPass += v.ph.size();
		ph.addAll(v.getPh());
		}
		}

	@Override
	public void embark(Passenger p) {
		if (!hasRoomFor(p)) {throw new IllegalArgumentException("no space");}
		else {
		ph.add(p);
		currentPass += 1;
		}
		}

	@Override
	public void disembark() {
		// TODO Auto-generated method stub
		ph.clear();
		vh.clear();
		this.currentPass = 0;
		this.currentVeh = 0;
	}

	@Override
	public boolean hasSpaceFor(Vehicle v) {
		if (currentVeh > maxCars) {
		return false;}
		else return true;
	}

	@Override
	public boolean hasRoomFor(Passenger p) {
		if (currentPass > maxPassengers) {
			return false;}
			else return true;
}

}
