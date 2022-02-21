package io.npee.designpatterns._04_factory._01_base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PizzaStoreTest {

	@Test
	void test() {
		PizzaStore store = new PizzaStore();
		Pizza pizza = store.orderPizza();
	}
}