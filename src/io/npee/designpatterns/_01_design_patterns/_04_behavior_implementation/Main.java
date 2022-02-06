package io.npee.designpatterns._01_design_patterns._04_behavior_implementation;

public class Main {
	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();

		RedHeadDuck redheadDuck = new RedHeadDuck();
		redheadDuck.display();
		redheadDuck.performFly();
		redheadDuck.performQuack();

		RubberDuck rubberDuck = new RubberDuck();
		rubberDuck.display();
		rubberDuck.performFly();
		rubberDuck.performQuack();
	}
}
