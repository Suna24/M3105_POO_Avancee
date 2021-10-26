package version2.weather;

public class WeatherStation {

	public static void main(String[] args) throws InterruptedException {
		WeatherData weatherData = new WeatherData();
	
		new CurrentConditionsDisplay(weatherData);
		new StatisticsDisplay(weatherData);
		new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		Thread.sleep(3000);
		weatherData.setMeasurements(82, 70, 29.2f);
		Thread.sleep(3000);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
