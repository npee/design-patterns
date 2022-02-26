package io.npee.designpatterns._04_factory._04_abstract_factory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		} else if (type.equals("clam")) {
			return new ChicagoStyleClamPizza();
		} else if (type.equals("veggie")) {
			return new ChicagoStyleCheesePizza();
		} else {
			throw new IllegalArgumentException("해당 타입의 피자가 없습니다.");
		}
	}
}
