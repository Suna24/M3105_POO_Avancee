package v3;

public class Movie {

	private String title;
	private Price price;

	public Movie(String title, Price priceCode) {
		this.title = title;
		this.price = priceCode;
	}

	public void setPriceCode(Price priceCode) {
		this.price = priceCode;
	}

	public String getTitle() {
		return title;
	}

	public double getCharge(int daysRented) {

		return price.getChargeFor(daysRented);
	}

	public int getFrequentRenterPoints(int daysRented) {

		return price.getFrequentRenterPointsFor(daysRented);
	}

}