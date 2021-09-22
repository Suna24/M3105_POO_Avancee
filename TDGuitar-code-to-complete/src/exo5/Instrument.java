package exo5;

public abstract class Instrument {
	
	//Attributes
	private String serialNumber;
	private double price;
	private InstrumentSpec instrumentSpec;
	
	//Constructor
	public Instrument(String serialNumber, double price, InstrumentSpec instrumentSpec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.instrumentSpec = instrumentSpec;
	}

	//Getters && Setters
	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public InstrumentSpec getInstrumentSpec() {
		return instrumentSpec;
	}

	public void setInstrumentSpec(InstrumentSpec instrumentSpec) {
		this.instrumentSpec = instrumentSpec;
	}

}
