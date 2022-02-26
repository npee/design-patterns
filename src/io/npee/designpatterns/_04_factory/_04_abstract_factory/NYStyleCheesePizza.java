package io.npee.designpatterns._04_factory._04_abstract_factory;

public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() {
		name = "뉴욕 스타일 소스 치즈 피자";
		dough = "씬 크러스트 도우";
		sauce = "마리나라 소스";

		toppings.add("잘게 썬 레지아노 치즈");
	}
}
