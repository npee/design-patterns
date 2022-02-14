package io.npee.designpatterns._02_observer._03_using_java_utils;

import java.util.Observable;
import java.util.Observer;

import io.npee.designpatterns._02_observer._02_weather_station.DisplayElement;

public class ForecastDisplay implements Observer, DisplayElement {

	private float currentPressure = 29.92f;
	private float lastPressure;
	private Observable weatherData;

	public ForecastDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}

	@Override
	public void display() {
		System.out.print("기상 예측: ");
		if (currentPressure > lastPressure) {
			System.out.println("날씨가 풀릴 것입니다.");
		} else if (currentPressure == lastPressure) {
			System.out.println("지금과 같습니다.");
		} else if (currentPressure < lastPressure) {
			System.out.println("흐린 날씨가 예상됩니다.");
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			float pressure = weatherData.getPressure();

			lastPressure = currentPressure;
			currentPressure = pressure;
			display();

		}
	}

	public float getCurrentPressure() {
		return currentPressure;
	}

	public float getLastPressure() {
		return lastPressure;
	}
}
