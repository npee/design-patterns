package io.npee.designpatterns._01_strategy._05_set_behavior;

public class RoboDuck extends Duck {

	public RoboDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}

	@Override
	void display() {
		System.out.println("Is it Duck?");
	}
}
