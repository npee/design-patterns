package io.npee.designpatterns._01_strategy._05_set_behavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak");
	}

}
