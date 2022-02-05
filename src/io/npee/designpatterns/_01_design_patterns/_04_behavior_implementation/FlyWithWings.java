package io.npee.designpatterns._01_design_patterns._04_behavior_implementation;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("The duck flies with wings.");
	}
}
