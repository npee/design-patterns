package io.npee.designpatterns._04_factory._04_abstract_factory;

public class BlackOlives implements Veggies {

	public BlackOlives() {
		info();
	}

	@Override
	public void info() {
		System.out.println("블랙 올리브");
	}
}
