package io.npee.designpatterns._04_factory._04_abstract_factory;

public class Mushroom implements Veggies {

	public Mushroom() {
		info();
	}

	@Override
	public void info() {
		System.out.println("버섯");
	}
}
