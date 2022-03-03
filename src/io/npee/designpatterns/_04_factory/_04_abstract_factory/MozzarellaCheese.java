package io.npee.designpatterns._04_factory._04_abstract_factory;

public class MozzarellaCheese implements Cheese {

	public MozzarellaCheese() {
		info();
	}

	@Override
	public void info() {
		System.out.println("모짜렐라 치즈");
	}
}
