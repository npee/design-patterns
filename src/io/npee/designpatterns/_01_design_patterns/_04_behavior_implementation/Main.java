package io.npee.designpatterns._01_design_patterns._04_behavior_implementation;

public class Main {
	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.flyBehavior.fly();
		mallardDuck.quack();

		RedHeadDuck redheadDuck = new RedHeadDuck();
		redheadDuck.display();
		redheadDuck.flyBehavior.fly();
		redheadDuck.quack();

		RubberDuck rubberDuck = new RubberDuck();
		rubberDuck.display();
		rubberDuck.flyBehavior.fly();
		rubberDuck.quack();
	}
}
