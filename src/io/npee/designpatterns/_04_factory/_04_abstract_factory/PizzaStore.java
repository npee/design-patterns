package io.npee.designpatterns._04_factory._04_abstract_factory;

public abstract class PizzaStore {

	Pizza orderPizza(String type) {

		Pizza pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	abstract Pizza createPizza(String type);
}
