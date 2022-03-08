package io.npee.designpatterns._06_command._01_diner;

public class Customer {

	Waitress waitress;
	Order order;

	public Customer(Waitress waitress) {
		this.waitress = waitress;
	}

	public void createOrder(Order order) {
		this.order = order;
	}

	public void hungry() {
		waitress.takeOrder(order);
	}

}
