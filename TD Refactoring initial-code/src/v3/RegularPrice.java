package v3;

public class RegularPrice implements Price{

	@Override
	public TypePrice getPriceCode() {
		return TypePrice.REGULAR;
	}

	@Override
	public double getChargeFor(int daysRented) {
		
		double result = 0;
		
		result += 2;
		if (daysRented > 2)
			result += (daysRented - 2) * 1.5;
		
		return result;
	}

}
