package version2.weather;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, Displayable{
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay(WeatherData weatherData) {
		weatherData.addObserver(this);
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
}
