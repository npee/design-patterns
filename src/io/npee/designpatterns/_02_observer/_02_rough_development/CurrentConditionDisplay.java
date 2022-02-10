package io.npee.designpatterns._02_observer._02_rough_development;

public class CurrentConditionDisplay implements Updatable {

	@Override
	public void update(float temperature, float humidity, float pressure) {
		System.out.println("Show current condition.");
	}
}
