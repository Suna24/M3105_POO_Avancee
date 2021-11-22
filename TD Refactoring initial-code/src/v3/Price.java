package v3;

public interface Price {
	
	public TypePrice getPriceCode();

	public double getChargeFor(int daysRented);
	
	public default int getFrequentRenterPointsFor(int daysRented) {
		return 1;
	}
}
