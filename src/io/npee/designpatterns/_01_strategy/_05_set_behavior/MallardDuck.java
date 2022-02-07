package io.npee.designpatterns._01_strategy._05_set_behavior;

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
