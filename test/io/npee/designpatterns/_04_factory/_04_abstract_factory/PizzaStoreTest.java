package io.npee.designpatterns._04_factory._04_abstract_factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PizzaStoreTest {

	@Test
	void nyPizzaStoreTest() {
		PizzaStore nyStore = new NYPizzaStore();
		Pizza nyCheesePizza = nyStore.orderPizza("cheese");
		assertInstanceOf(CheesePizza.class, nyCheesePizza);
		assertInstanceOf(ThinCrustDough.class, nyCheesePizza.dough);
	}
}