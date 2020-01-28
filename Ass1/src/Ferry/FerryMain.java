package Ferry;

public class FerryMain {

	public FerryMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FerryClass f = new FerryClass();
			Car g = new Car(3);
			Lorry l = new Lorry(1);
			Bicycle o = new Bicycle();
			Passenger j = new Passenger();
			f.embark(g);
			f.embark(l);
			f.embark(o);
			f.embark(j);
			System.out.println(f.countMoney());
		
			System.out.println(f.getAllVehicles());
			f.disembark();
			System.out.println(f.countPassengers());
			System.out.println(f.countVehicleSpace());
			System.out.println(f.countMoney());
	
			System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLL");
			Car p = new Car(2);
			f.embark(p);
			System.out.println(f.countMoney());
			}
			catch (Exception e) {
				System.out.println(e);
			}
		
	}

}
