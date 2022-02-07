package io.npee.designpatterns._01_strategy._05_set_behavior;

public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}

	@Override
	void display() {
		System.out.println("Yellow toy duck");
	}
}
