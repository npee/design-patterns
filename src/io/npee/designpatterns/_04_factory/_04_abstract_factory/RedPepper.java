package io.npee.designpatterns._04_factory._04_abstract_factory;

public class RedPepper implements Veggies {

	public RedPepper() {
		info();
	}

	@Override
	public void info() {
		System.out.println("레드 페퍼");
	}
}
