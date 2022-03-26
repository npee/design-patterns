package io.npee.designpatterns._03_decorator._02_decorator;

public class Whip extends CondimentDecorator {

	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 휘핑 크림";
	}
}
