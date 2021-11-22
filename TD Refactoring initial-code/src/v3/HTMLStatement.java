package v3;

public class HTMLStatement extends Statement {

	@Override
	public String header(Customer customer) {
		return "<h1>Rental Record for <em>" + customer.getName() + "</em></h1>\n<ul>\n";
	}

	@Override
	public String middle(Rental each) {

		// show figures for this rental
		return "\t<li>" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "</li>\n";

	}

	@Override
	public String footer(Customer customer) {
		return "</ul>\n" +
		"<p>Amount owed is " + String.valueOf(customer.getTotalCharge()) + "</p>\n" +
		"<p>You earned " + String.valueOf(customer.getTotalFrequentRenterPoints())
				+ " frequent renter points</p>";

	}

}
