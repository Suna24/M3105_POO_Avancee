package version1.weather;

public class CurrentConditionsDisplay implements Observateur, Displayable{
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay(WeatherData weatherData) {
		weatherData.registerObservateur(this);
	}
	
	public void actualiserMesures(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
