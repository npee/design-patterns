package io.npee.designpatterns._01_design_patterns._01_base;

public abstract class Duck {
	void quack() {
		System.out.println("The duck quacks");
	}
	void swim() {
		System.out.println("The duck swims");
	}
	abstract void display();
}