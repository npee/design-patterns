package io.npee.designpatterns._03_decorator._01_base;

public abstract class Beverage {

	String description = "제목 없음";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
