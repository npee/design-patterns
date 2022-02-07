package io.npee.designpatterns._01_strategy._04_behavior_implementation;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("The duck can't fly.");
	}
}
