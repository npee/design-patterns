package io.npee.designpatterns._06_command._01_diner;

public class BurgerAndFriesOrder implements Order {

	Cook cook;

	public BurgerAndFriesOrder(Cook cook) {
		this.cook = cook;
	}

	@Override
	public void orderUp() {
		cook.makeBurger();
		cook.makeFries();
	}
}
