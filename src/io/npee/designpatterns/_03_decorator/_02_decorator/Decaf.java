package io.npee.designpatterns._03_decorator._02_decorator;

public class Decaf extends Beverage {

	public Decaf() {
		description = "๋์นดํ์ธ";
	}

	@Override
	public double cost() {
		return 1.05;
	}
}
