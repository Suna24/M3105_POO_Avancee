package v3;

public class TextStatement extends Statement{

	@Override
	public String header(Customer customer) {
		return "Rental Record for " + customer.getName() + "\n";
	}

	@Override
	public String middle(Rental each) {

		// show figures for this rental
		return "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";

	}

	@Override
	public String footer(Customer customer) {
		return "Amount owed is " + String.valueOf(customer.getTotalCharge()) + "\n" +
		"You earned " + String.valueOf(customer.getTotalFrequentRenterPoints())
				+ " frequent renter points";

	}

}
