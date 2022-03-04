package io.npee.designpatterns._04_factory._04_abstract_factory;

public class Eggplant implements Veggies {

	public Eggplant() {
		info();
	}

	@Override
	public void info() {
		System.out.println("가지");
	}
}
