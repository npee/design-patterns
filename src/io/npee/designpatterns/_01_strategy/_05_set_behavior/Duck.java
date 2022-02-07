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

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
}