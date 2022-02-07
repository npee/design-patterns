package io.npee.designpatterns._01_strategy._05_set_behavior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack");
	}
}
