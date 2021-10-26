package version2.weather;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, Displayable {
	private float currentPressure = 29.92f;  
	private float lastPressure;

	public ForecastDisplay(WeatherData weatherData) {
		weatherData.addObserver(this);
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

	@Override
	public void update(Observable o, Object arg) {
        lastPressure = currentPressure;
		currentPressure = ((WeatherData) o).getPressure();
		display();
		
	}
}
