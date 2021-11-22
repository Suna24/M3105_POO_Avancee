package v3;

public class NewReleasePrice implements Price{

	@Override
	public TypePrice getPriceCode() {
		return TypePrice.NEW_RELEASE;
	}

	@Override
	public double getChargeFor(int daysRented) {
		
		double result = 0;
		
		result += daysRented * 3;
		
		return result;
	}
	
	public int getFrequentRenterPointsFor(int daysRented) {
		if(daysRented > 1) {
			return 2;
		} else {
			return 1;
		}
	}

}
