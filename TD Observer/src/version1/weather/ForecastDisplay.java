package version1.weather;

public class ForecastDisplay implements Observateur, Displayable {
	private float currentPressure = 29.92f;  
	private float lastPressure;

	public ForecastDisplay(WeatherData weatherData) {
		weatherData.registerObservateur(this);
	}

	public void actualiserMesures(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
		currentPressure = pressure;
		display();
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
