package io.npee.designpatterns._04_factory._04_abstract_factory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		return new Veggies[0];
	}

	@Override
	public Pepperoni createPepperoni() {
		return null;
	}

	@Override
	public Clams createClam() {
		return new FrozenClams();
	}
}
