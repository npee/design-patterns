package io.npee.designpatterns._02_observer._02_weather_station;

public class ForecastDisplay implements Observer, DisplayElement {

	private float currentPressure = 29.92f;
	private float lastPressure;
	private WeatherData weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
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
	public void update(float temperature, float humidity, float pressure) {
		lastPressure = currentPressure;
		currentPressure = pressure;
		display();
	}
}
