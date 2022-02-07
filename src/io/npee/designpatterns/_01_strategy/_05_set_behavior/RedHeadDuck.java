package io.npee.designpatterns._01_strategy._05_set_behavior;

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
