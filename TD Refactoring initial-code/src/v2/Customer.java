package v2;

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

	public String statement() {

		StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");

		for (Rental each : rentals) {

			// show figures for this rental
			result.append("\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n");
		}

		// add footer lines
		result.append("Amount owed is " + String.valueOf(getTotalCharge()) + "\n");
		result.append("You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points");

		return result.toString();
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

	public String htmlStatement() {
		
		StringBuilder result = new StringBuilder("<h1>Rental Record for <em>" + getName() + "</em></h1>\n<ul>\n");

		for (Rental each : rentals) {

			// show figures for this rental
			result.append("\t<li>" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "</li>\n");
		}
		
		result.append("</ul>\n");

		// add footer lines
		result.append("<p>Amount owed is " + String.valueOf(getTotalCharge()) + "</p>\n");
		result.append("<p>You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points</p>");

		return result.toString();
	}

}
