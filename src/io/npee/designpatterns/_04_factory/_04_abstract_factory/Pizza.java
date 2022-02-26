package io.npee.designpatterns._04_factory._04_abstract_factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

	String name;
	String dough;
	String sauce;
	List<String> toppings = new ArrayList<>();

	public void prepare() {
		System.out.println(name + " 준비");
		System.out.println(dough + " 반죽 던지기");
		System.out.println(sauce + " 추가");
		System.out.println("토핑 추가 ->");
		for (String topping : toppings) {
			System.out.println("\t" + topping);
		}
	}

	public void bake() {
		System.out.println("350도에서 25분동안 굽기");
	}

	public void cut() {
		System.out.println("대각선으로 피자 자르기");
	}

	public void box() {
		System.out.println("공식 피자 박스로 포장하기");
	}

	public String getName() {
		return name;
	}
}