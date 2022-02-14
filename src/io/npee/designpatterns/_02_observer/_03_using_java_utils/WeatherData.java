package io.npee.designpatterns._02_observer._03_using_java_utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import io.npee.designpatterns._02_observer._02_weather_station.Observer;
import io.npee.designpatterns._02_observer._02_weather_station.Subject;

public class WeatherData extends Observable {

	private float temperature;
	private float humidity;
	private float pressure;

	/**
	 * 기상 관측값이 갱신될 떄 마다 알려주기 위한 메서드
	 */
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}
