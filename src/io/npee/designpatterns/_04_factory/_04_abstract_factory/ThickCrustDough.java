package io.npee.designpatterns._04_factory._04_abstract_factory;

public class ThickCrustDough implements Dough {

	public ThickCrustDough() {
		info();
	}

	@Override
	public void info() {
		System.out.println("매우 두꺼운 크러스트 도우");
	}
}
