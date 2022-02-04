package io.npee.designpatterns._01_design_patterns._01_base;

public class Main {
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();

		Duck redheadDuck = new RedHeadDuck();
		redheadDuck.display();
	}
}
