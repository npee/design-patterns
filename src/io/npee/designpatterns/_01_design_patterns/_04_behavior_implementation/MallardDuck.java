package io.npee.designpatterns._01_design_patterns._04_behavior_implementation;

public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	void display() {
		System.out.println("It has green head.");
	}
}
