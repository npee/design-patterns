package io.npee.designpatterns._04_factory._04_abstract_factory;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		name = "시카고 스타일 딥디쉬 치즈 피자";
		dough = "매우 두꺼운 크러스트 도우";
		sauce = "자두 토마토 소스";

		toppings.add("슈레드 모짜렐라 치즈");
	}

	@Override
	public void cut() {
		System.out.println("피자를 사각형으로 자릅니다.");
	}
}
