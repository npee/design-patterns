package io.npee.designpatterns._01_strategy._03_using_interface;

public class Main {
	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.fly();
		mallardDuck.quack();

		RedHeadDuck redheadDuck = new RedHeadDuck();
		redheadDuck.display();
		redheadDuck.fly();
		redheadDuck.quack();

		RubberDuck rubberDuck = new RubberDuck();
		rubberDuck.display();
		// rubberDuck.fly();
		rubberDuck.quack();

	}
}
