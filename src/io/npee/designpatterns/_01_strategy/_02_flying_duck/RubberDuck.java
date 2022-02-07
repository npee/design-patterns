package io.npee.designpatterns._01_strategy._02_flying_duck;

public class RubberDuck extends Duck {

	@Override
	void quack() {
		System.out.println("Squeak");
	}

	@Override
	void display() {
		System.out.println("Yellow toy duck");
	}
}
