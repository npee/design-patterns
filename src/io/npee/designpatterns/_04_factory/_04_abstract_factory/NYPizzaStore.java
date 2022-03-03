package io.npee.designpatterns._04_factory._04_abstract_factory;

public class NYPizzaStore extends PizzaStore {

	Pizza pizza = null;
	PizzaIngredientFactory ingredientFactory;

	public NYPizzaStore() {
		this.ingredientFactory = new NYPizzaIngredientFactory();
	}

	@Override
	Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("뉴욕 스타일 치즈 피자");
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("뉴욕 스타일 페퍼로니 피자");
		} else if (type.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("뉴욕 스타일 조개 피자");
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("뉴욕 스타일 야채 피자");
		} else {
			throw new IllegalArgumentException("해당 타입의 피자가 없습니다.");
		}
		return pizza;
	}
}
