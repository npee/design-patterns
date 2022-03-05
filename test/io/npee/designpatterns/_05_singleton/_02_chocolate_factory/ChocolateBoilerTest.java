package io.npee.designpatterns._05_singleton._02_chocolate_factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChocolateBoilerTest {

	@Test
	void chocolateBoilerTest() {

		ChocolateBoiler uniqueBoiler = ChocolateBoiler.getInstance();
		uniqueBoiler.fill();
		uniqueBoiler.boil();
		uniqueBoiler.drain();
		ChocolateBoiler uniqueBoiler2 = ChocolateBoiler.getInstance();

		assertEquals(uniqueBoiler.isEmpty(), uniqueBoiler2.isEmpty());
		assertEquals(uniqueBoiler.isBoiled(), uniqueBoiler2.isBoiled());
	}

}