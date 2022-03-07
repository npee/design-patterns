package io.npee.designpatterns._05_singleton._03_thread_safety;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
public class ChocolateBoilerThreadV3Test {

	@Test
	void threadSafeTestV2_thread1() {
		ThreadSafeChocolateBoilerV3 boiler = ThreadSafeChocolateBoilerV3.getInstance();
		Thread thread = new Thread(boiler);
		thread.run();
		assertTrue(boiler.isEmpty());
		assertFalse(boiler.isBoiled());
	}

	@Test
	void threadSafeTestV2_thread2() {
		ThreadSafeChocolateBoilerV3 boiler = ThreadSafeChocolateBoilerV3.getInstance();
		Thread thread = new Thread(boiler);
		thread.run();
		assertTrue(boiler.isEmpty());
		assertFalse(boiler.isBoiled());
	}
}
