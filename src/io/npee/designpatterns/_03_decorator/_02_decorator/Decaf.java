package io.npee.designpatterns._03_decorator._02_decorator;

public class Decaf extends Beverage {

	public Decaf() {
		description = "디카페인";
	}

	@Override
	public double cost() {
		return 1.05;
	}
}
