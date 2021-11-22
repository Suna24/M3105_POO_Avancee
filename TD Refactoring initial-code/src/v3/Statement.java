package v3;


public abstract class Statement {
	
	private StringBuilder result;
	
	public abstract String header(Customer customer);
	
	public abstract String middle(Rental rental);
	
	public abstract String footer(Customer customer);
	
	
	public void execute(Customer customer) {
		result = new StringBuilder(header(customer));
		
		for(Rental each : customer.getRentals()) {
			result.append(middle(each));
		}
		
		result.append(footer(customer));
	}
	
	public StringBuilder getResult() {
		return result;
	}

}
