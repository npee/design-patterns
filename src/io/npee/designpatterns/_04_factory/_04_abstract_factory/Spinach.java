package io.npee.designpatterns._04_factory._04_abstract_factory;

public class Spinach implements Veggies {

	public Spinach() {
		info();
	}

	@Override
	public void info() {
		System.out.println("시금치");
	}
}
