package io.npee.designpatterns._01_strategy._03_using_interface;

public abstract class Duck {
	void swim() {
		System.out.println("The duck swims");
	}
	abstract void display();
	// void fly();
}