package io.npee.designpatterns._02_observer._02_weather_station;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WeatherDataTest {

	@Test
	void weatherDataTest() {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		assertEquals(80.0f, currentConditionsDisplay.getTemperature());
		assertEquals(65.0f, currentConditionsDisplay.getHumidity());
		assertEquals(80.0f, statisticsDisplay.getTemperatureSum() / statisticsDisplay.getNumReadings());
		assertEquals(80.0f, statisticsDisplay.getMaxTemperature());
		assertEquals(80.0f, statisticsDisplay.getMinTemperature());
		assertTrue(forecastDisplay.getCurrentPressure() > forecastDisplay.getLastPressure());

		weatherData.setMeasurements(82, 70, 29.2f);
		assertEquals(82.0f, currentConditionsDisplay.getTemperature());
		assertEquals(70.0f, currentConditionsDisplay.getHumidity());
		assertEquals(81.0f, statisticsDisplay.getTemperatureSum() / statisticsDisplay.getNumReadings());
		assertEquals(82.0f, statisticsDisplay.getMaxTemperature());
		assertEquals(80.0f, statisticsDisplay.getMinTemperature());
		assertTrue(forecastDisplay.getCurrentPressure() < forecastDisplay.getLastPressure());

		weatherData.setMeasurements(78, 90, 29.2f);
		assertEquals(78.0f, currentConditionsDisplay.getTemperature());
		assertEquals(90.0f, currentConditionsDisplay.getHumidity());
		assertEquals(80.0f, statisticsDisplay.getTemperatureSum() / statisticsDisplay.getNumReadings());
		assertEquals(82.0f, statisticsDisplay.getMaxTemperature());
		assertEquals(78.0f, statisticsDisplay.getMinTemperature());
		assertEquals(forecastDisplay.getCurrentPressure(), forecastDisplay.getLastPressure());
	}

	@Test
	void heatIndexTest() {
		WeatherData weatherData = new WeatherData();

		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		assertEquals(82.95535f, heatIndexDisplay.getHeatIndex());
		weatherData.setMeasurements(82, 70, 29.2f);
		assertEquals(86.90124f, heatIndexDisplay.getHeatIndex());
		weatherData.setMeasurements(78, 90, 29.2f);
		assertEquals(83.64967f, heatIndexDisplay.getHeatIndex());
	}
}