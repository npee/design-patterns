package io.npee.designpatterns._01_design_patterns._04_behavior_implementation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DuckTest {

	@Test
	void duckTest() {
		Duck mallardDuck = new MallardDuck();
		Duck redheadDuck = new RedHeadDuck();
		Duck rubberDuck = new RubberDuck();

		assertInstanceOf(FlyWithWings.class, mallardDuck.flyBehavior);
		assertInstanceOf(Quack.class, mallardDuck.quackBehavior);
		assertInstanceOf(FlyWithWings.class, redheadDuck.flyBehavior);
		assertInstanceOf(Quack.class, redheadDuck.quackBehavior);
		assertInstanceOf(FlyNoWay.class, rubberDuck.flyBehavior);
		assertInstanceOf(Squeak.class, rubberDuck.quackBehavior);
	}
}