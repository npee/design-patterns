package io.npee.designpatterns._01_strategy._05_set_behavior;

public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	void swim() {
		System.out.println("The duck swims");
	}
	void performFly() {
		this.flyBehavior.fly();
	}
	void performQuack() {
		this.quackBehavior.quack();
	}
	abstract void display();
}