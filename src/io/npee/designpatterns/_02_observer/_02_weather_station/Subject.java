package io.npee.designpatterns._02_observer._02_weather_station;

public interface Subject {

	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}
