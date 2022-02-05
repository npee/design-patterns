package io.npee.designpatterns._01_design_patterns._02_flying_duck;

public class Main {
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.fly();

		Duck redheadDuck = new RedHeadDuck();
		redheadDuck.display();
		redheadDuck.fly();

		Duck rubberDuck = new RubberDuck();
		rubberDuck.fly(); // Flying rubber duck
	}
}