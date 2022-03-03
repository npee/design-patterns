package io.npee.designpatterns._04_factory._04_abstract_factory;

public class ThinCrustDough implements Dough {

	public ThinCrustDough() {
		info();
	}

	@Override
	public void info() {
		System.out.println("씬 크러스트 도우");
	}
}
