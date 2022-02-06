package io.npee.designpatterns._01_design_patterns._04_behavior_implementation;

public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Quack");
	}
}
