package io.npee.designpatterns._04_factory._01_base;

public class PizzaStore {

	Pizza orderPizza() {
		Pizza pizza = new Pizza();

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
