package io.npee.designpatterns._01_design_patterns._04_behavior_implementation;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("The duck can't fly.");
	}
}
