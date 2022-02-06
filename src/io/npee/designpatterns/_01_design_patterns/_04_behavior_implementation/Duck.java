package io.npee.designpatterns._01_design_patterns._04_behavior_implementation;

public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	void swim() {
		System.out.println("The duck swims");
	}
	abstract void display();
}