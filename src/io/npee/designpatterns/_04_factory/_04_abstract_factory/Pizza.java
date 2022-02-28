package io.npee.designpatterns._04_factory._04_abstract_factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

	String name;
	Dough dough;
	Sauce sauce;
	Veggies[] veggies;
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;

	abstract void prepare();

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

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pizza name: '" + name + "'";
	}
}