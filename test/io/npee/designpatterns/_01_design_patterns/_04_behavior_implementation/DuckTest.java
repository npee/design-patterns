package io.npee.designpatterns._01_design_patterns._04_behavior_implementation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DuckTest {

	@Test
	void mallardDuck() {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		assertInstanceOf(FlyWithWings.class, mallardDuck.flyBehavior);
		assertInstanceOf(Quack.class, mallardDuck.quackBehavior);
	}
}