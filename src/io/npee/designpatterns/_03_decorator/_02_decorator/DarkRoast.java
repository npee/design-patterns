package io.npee.designpatterns._03_decorator._02_decorator;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "다크 로스트 커피";
	}

	@Override
	public double cost() {
		return .99;
	}
}
