package io.npee.designpatterns._07_adapter._01_duck;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TurkeyAdapterTest {

	@Test
	void turkeyAdapterTest() {

		MallardDuck duck = new MallardDuck();

		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("칠면조");
		turkey.gobble();
		turkey.fly();

		System.out.println("오리");
		testDuck(duck);

		System.out.println("오리?");
		testDuck(turkeyAdapter);

	}

	void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

}