package io.npee.designpatterns._05_singleton._03_thread_safety;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChocolateBoilerTest {

	@Test
	void threadUnsafeTest() throws InterruptedException {
		ThreadUnsafeChocolateBoiler boiler1 = ThreadUnsafeChocolateBoiler.getInstance();
		boiler1.fill();
		boiler1.boil();
		ThreadUnsafeChocolateBoiler boiler2 = ThreadUnsafeChocolateBoiler.getInstance();
		assertThrows(IllegalStateException.class, () -> boiler2.fill());
		assertThrows(IllegalStateException.class, () -> boiler2.boil());
		boiler2.drain();
		assertThrows(IllegalStateException.class, () -> boiler1.drain());
	}
}