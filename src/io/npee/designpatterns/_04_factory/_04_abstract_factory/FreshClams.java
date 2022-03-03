package io.npee.designpatterns._04_factory._04_abstract_factory;

public class FreshClams implements Clams {

	public FreshClams() {
		info();
	}

	@Override
	public void info() {
		System.out.println("신선한 조개들");
	}
}
