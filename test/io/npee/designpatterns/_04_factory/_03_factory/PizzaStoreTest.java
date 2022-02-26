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

	@Test
	void orderChicagoPizzaTest() {
		ChicagoPizzaStore store = new ChicagoPizzaStore();
		Pizza pizza = store.orderPizza("clam");
		assertInstanceOf(ChicagoStyleClamPizza.class, pizza);
	}

	@Test
	void createPizza() {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

		Pizza nyCheesePizza = nyPizzaStore.orderPizza("cheese");
		assertInstanceOf(Pizza.class, nyCheesePizza);

		Pizza chicagoCheesePizza = chicagoPizzaStore.orderPizza("cheese");
		assertInstanceOf(Pizza.class, chicagoCheesePizza);
	}

}