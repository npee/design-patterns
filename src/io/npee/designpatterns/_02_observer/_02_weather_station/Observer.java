package io.npee.designpatterns._02_observer._02_weather_station;

public interface Observer {

	void update(float temperature, float humidity, float pressure);
}
