package io.npee.designpatterns._04_factory._04_abstract_factory;

public class Garlic implements Veggies {

	public Garlic() {
		info();
	}

	@Override
	public void info() {
		System.out.println("마늘");
	}
}
