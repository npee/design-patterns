package io.npee.designpatterns._02_observer._01_base;

public class WeatherData {

	private float temperature;
	private float humidity;
	private float pressure;

	/**
	 * 기상 관측값이 갱신될 떄 마다 알려주기 위한 메서드
	 */
	public void measurementsChanged() {
		// to-do
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
