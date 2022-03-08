package io.npee.designpatterns._06_command._01_diner;

public class Waitress {

	Order order;
	public void takeOrder(Order order) {
		this.order = order;
		order.orderUp();
	}
}
