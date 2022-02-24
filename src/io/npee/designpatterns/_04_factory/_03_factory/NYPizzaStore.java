package io.npee.designpatterns._04_factory._03_factory;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else if (type.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (type.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else {
			throw new IllegalArgumentException("해당 타입의 피자가 없습니다.");
		}
	}
}
