package io.npee.designpatterns._04_factory._02_simple_factory;

public class PizzaStore {

	SimplePizzaFactory factory;

	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}

	Pizza orderPizza(String type) {

		Pizza pizza = factory.createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
