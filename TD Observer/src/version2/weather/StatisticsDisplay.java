package version2.weather;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, Displayable {
	
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;

	public StatisticsDisplay(WeatherData weatherData) {
		weatherData.addObserver(this);
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}

	@Override
	public void update(Observable o, Object arg) {
		
		float temp = ((WeatherData)o).getTemperature();
		
		tempSum += temp;
		numReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}
 
		if (temp < minTemp) {
			minTemp = temp;
		}
		
		display();
		
	}
}
