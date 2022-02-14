package io.npee.designpatterns._02_observer._03_using_java_utils;

import java.util.Observable;
import java.util.Observer;

import io.npee.designpatterns._02_observer._02_weather_station.DisplayElement;
import io.npee.designpatterns._02_observer._02_weather_station.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Observable weatherData;

	public CurrentConditionsDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("현재 기상 조건 -> 기온: " + temperature + "F, 습도: " + humidity + "%");
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}
}
