package io.npee.designpatterns._01_design_patterns._02_flying_duck;

public abstract class Duck {
	void quack() {
		System.out.println("The duck quacks");
	}
	void swim() {
		System.out.println("The duck swims");
	}
	void fly() {
		System.out.println("The duck flies");
	}
	abstract void display();
}