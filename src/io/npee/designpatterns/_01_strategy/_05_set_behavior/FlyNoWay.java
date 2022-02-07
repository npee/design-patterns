package io.npee.designpatterns._01_strategy._05_set_behavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("The duck can't fly.");
	}
}
