package io.npee.designpatterns._01_design_patterns._04_behavior_implementation;

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
