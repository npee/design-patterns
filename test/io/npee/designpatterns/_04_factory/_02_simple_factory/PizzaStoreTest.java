package io.npee.designpatterns._04_factory._02_simple_factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PizzaStoreTest {

	PizzaStore pizzaStore;

	@BeforeEach
	void init() {
		pizzaStore = new PizzaStore();
	}

	@Test
	void throwExceptionTest() {
		assertThrows(IllegalArgumentException.class, () -> pizzaStore.orderPizza("greek"));
	}

	@Test
	void addedPizzaTest() {
		pizzaStore.orderPizza("clam");
	}
}