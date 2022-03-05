package io.npee.designpatterns._05_singleton._01_classic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingletonTest {

	@Test
	void singletonTest() {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		assertEquals(singleton1, singleton2);
	}
}