package io.npee.designpatterns._04_factory._02_simple_factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PizzaStoreTest {

	@Test
	void test() {
		PizzaStore store = new PizzaStore();
		store.orderPizza("greek");
	}
}