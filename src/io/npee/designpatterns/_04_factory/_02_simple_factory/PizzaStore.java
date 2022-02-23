package io.npee.designpatterns._04_factory._02_simple_factory;

public class PizzaStore {

	Pizza orderPizza(String type) {
		Pizza pizza;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		} else {
			throw new IllegalArgumentException("해당 타입의 피자가 없습니다.");
		}

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
