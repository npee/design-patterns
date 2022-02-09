package io.npee.designpatterns._01_strategy._05_set_behavior;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RoboDuckTest {

	@Test
	void roboDuckTest() {
		Duck roboDuck = new RoboDuck();

		roboDuck.performFly();
		roboDuck.performQuack();
		assertInstanceOf(FlyNoWay.class, roboDuck.flyBehavior);
		assertInstanceOf(MuteQuack.class, roboDuck.quackBehavior);
	}
}