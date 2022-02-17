package io.npee.designpatterns._03_decorator._02_decorator;

public class Espresso extends Beverage {

	public Espresso() {
		description = "에스프레소";
	}

	@Override
	public double cost() {
		return 1.99;
	}
}
