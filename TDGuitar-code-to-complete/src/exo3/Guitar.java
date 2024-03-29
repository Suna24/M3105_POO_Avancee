package exo3;

public class Guitar {
	
	//Attributs
	private String serialNumber;
	private double price;
	private GuitarSpec spec;
	
	//Constructeur
	public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		this.serialNumber = serialNumber;
		this.price = price;
		spec = new GuitarSpec(builder, model, type, backWood, topWood);
	}
	
	//Getters && Setters
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}

	public GuitarSpec getSpec() {
		return spec;
	}

}
