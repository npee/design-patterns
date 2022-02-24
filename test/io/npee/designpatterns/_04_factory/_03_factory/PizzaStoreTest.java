package io.npee.designpatterns._04_factory._03_factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PizzaStoreTest {

	@Test
	void orderPizzaTest() {
		NYPizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza pizza = nyPizzaStore.orderPizza("cheese");
		assertInstanceOf(NYStyleCheesePizza.class, pizza);
	}
}