package io.npee.designpatterns._04_factory._04_abstract_factory;

public class PlumTomatoSauce implements Sauce {

	public PlumTomatoSauce() {
		info();
	}

	@Override
	public void info() {
		System.out.println("자두 토마토 소스");
	}
}
