package io.npee.designpatterns._01_design_patterns._03_using_interface;

public class RubberDuck extends Duck implements Quackable {

	@Override
	public void quack() {
		System.out.println("Squeak");
	}

	@Override
	void display() {
		System.out.println("Yellow toy duck");
	}
}
