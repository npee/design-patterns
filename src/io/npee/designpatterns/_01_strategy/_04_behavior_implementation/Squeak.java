package io.npee.designpatterns._01_strategy._04_behavior_implementation;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak");
	}

}
