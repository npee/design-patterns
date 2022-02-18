package io.npee.designpatterns._03_decorator._02_decorator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BeverageTest {

	@Test
	void beverageTest() {

		Beverage espresso = new Espresso();
		assertEquals(1.99, espresso.cost());
		printCost(espresso);

		Beverage darkRoast = new DarkRoast();
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Whip(darkRoast);
		assertEquals(1.49, darkRoast.cost());
		printCost(darkRoast);

		Beverage houseBlend = new HouseBlend();
		houseBlend = new Soy(houseBlend);
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Whip(houseBlend);
		assertEquals(1.34, houseBlend.cost());
		printCost(houseBlend);
	}

	private void printCost(Beverage b) {
		System.out.println(b.getDescription() + " $" + b.cost());
	}

}