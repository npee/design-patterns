package io.npee.designpatterns._04_factory._02_simple_factory;

public class VeggiePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("사전 준비");
	}

	@Override
	public void bake() {
		System.out.println("굽기");
	}

	@Override
	public void cut() {
		System.out.println("자르기");
	}

	@Override
	public void box() {
		System.out.println("포장하기");
	}
}
