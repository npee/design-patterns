package io.npee.designpatterns._02_observer._02_weather_station;

public class StatisticsDisplay implements Observer, DisplayElement {

	private float maxTemperature = 0.0f;
	private float minTemperature = 200;
	private float temperatureSum = 0.0f;
	private int numReadings;
	private WeatherData weatherData;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("평균/최대/최소 기온 -> " + (temperatureSum / numReadings) + " / " + maxTemperature + " / " + minTemperature);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		temperatureSum += temperature;
		numReadings++;

		if (temperature > maxTemperature) {
			maxTemperature = temperature;
		}

		if (temperature < minTemperature) {
			minTemperature = temperature;
		}

		display();
	}

	public float getMaxTemperature() {
		return maxTemperature;
	}

	public float getMinTemperature() {
		return minTemperature;
	}

	public float getTemperatureSum() {
		return temperatureSum;
	}

	public int getNumReadings() {
		return numReadings;
	}
}
