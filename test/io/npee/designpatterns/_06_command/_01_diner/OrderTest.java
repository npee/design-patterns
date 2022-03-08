package io.npee.designpatterns._06_command._01_diner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrderTest {

	@Test
	void orderTest() {
		Cook cook = new Cook();
		Waitress waitress = new Waitress();
		Customer customer = new Customer(waitress);
		customer.createOrder(new BurgerAndFriesOrder(cook));
		customer.hungry();
	}
}