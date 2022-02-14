package io.npee.designpatterns._02_observer._03_using_java_utils;

import java.util.Observable;
import java.util.Observer;

import io.npee.designpatterns._02_observer._02_weather_station.DisplayElement;

public class StatisticsDisplay implements Observer, DisplayElement {

	private float maxTemperature = 0.0f;
	private float minTemperature = 200;
	private float temperatureSum = 0.0f;
	private int numReadings;
	private Observable weatherData;

	public StatisticsDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("평균/최대/최소 기온 -> " + (temperatureSum / numReadings) + "F / " + maxTemperature + "F / " + minTemperature + "F");
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			float currentTemperature = weatherData.getTemperature();

			temperatureSum += currentTemperature;
			numReadings++;

			if (weatherData.getTemperature() > maxTemperature) {
				maxTemperature = currentTemperature;
			}

			if (currentTemperature < minTemperature) {
				minTemperature = currentTemperature;
			}

			display();
		}

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
