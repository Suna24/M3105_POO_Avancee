package v3;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String name;
	private List<Rental> rentals = new ArrayList<Rental>();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental aRental) {
		rentals.add(aRental);
	}

	public String getName() {
		return name;
	}


	public double getTotalCharge() {

		double result = 0;

		for (Rental each : rentals) {
			result += each.getCharge();
		}

		return result;
	}

	public int getTotalFrequentRenterPoints() {

		int result = 0;

		for (Rental each : rentals) {
			result += each.getFrequentRenterPoints();
		}

		return result;
	}

	public StringBuilder htmlStatement() {
		
		Statement st = new HTMLStatement();
		st.execute(this);
		return st.getResult();
	}
	
	public StringBuilder statement() {
		
		Statement st = new TextStatement();
		st.execute(this);
		return st.getResult();
		
	}

	
	public List<Rental> getRentals() {
		return rentals;
	}

}
