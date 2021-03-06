package io.npee.designpatterns._03_decorator._02_decorator;

public class Milk extends CondimentDecorator {

	Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 스팀 밀크";
	}
}
