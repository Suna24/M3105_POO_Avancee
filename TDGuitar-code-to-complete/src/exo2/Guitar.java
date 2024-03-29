package exo2;

public class Guitar {
	
	//Attributs
	private String serialNumber;
	private double price;
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	
	//Constructeur
	public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
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
	
	public Builder getBuilder() {
		return builder;
	}
	
	public String getModel() {
		return model;
	}
	
	public Type getType() {
		return type;
	}
	
	public Wood getBackWood() {
		return backWood;
	}
	
	public Wood getTopWood() {
		return topWood;
	}
	

}
