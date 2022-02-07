package io.npee.designpatterns._01_strategy._04_behavior_implementation;

public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	void display() {
		System.out.println("It has red head.");
	}
}
