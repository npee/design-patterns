package io.npee.designpatterns._04_factory._04_abstract_factory;

public class FrozenClams implements Clams {

	public FrozenClams() {
		info();
	}

	@Override
	public void info() {
		System.out.println("냉동 조개들");
	}
}
