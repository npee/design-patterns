package io.npee.designpatterns._01_design_patterns._04_behavior_implementation;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("...!");
	}
}
