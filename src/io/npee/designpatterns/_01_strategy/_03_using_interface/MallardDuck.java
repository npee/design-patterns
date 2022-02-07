package io.npee.designpatterns._01_strategy._03_using_interface;

public class MallardDuck extends Duck implements Flyable, Quackable {

	@Override
	public void fly() {
		System.out.println("The duck flies");
	}


	@Override
	public void quack() {
		System.out.println("Quack");
	}

	@Override
	void display() {
		System.out.println("It has green head.");
	}
}
