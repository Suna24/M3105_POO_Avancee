package v3;

public class ChildrenPrice implements Price{

	@Override
	public TypePrice getPriceCode() {
		return TypePrice.CHILDRENS;
	}

	@Override
	public double getChargeFor(int daysRented) {
		
		double result = 0;
		
		result += 1.5;
		if (daysRented > 3)
			result += (daysRented - 3) * 1.5;
		
		return result;
	}

}
