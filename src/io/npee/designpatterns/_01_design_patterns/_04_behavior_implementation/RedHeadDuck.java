package io.npee.designpatterns._01_design_patterns._04_behavior_implementation;

public class RedHeadDuck extends Duck {

	public void quack() {
		System.out.println("Quack");
	}

	@Override
	void display() {
		System.out.println("It has red head.");
	}
}
