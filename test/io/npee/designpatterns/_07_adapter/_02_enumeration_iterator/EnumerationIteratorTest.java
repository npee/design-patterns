package io.npee.designpatterns._07_adapter._02_enumeration_iterator;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

import org.junit.jupiter.api.Test;

class EnumerationIteratorTest {

	@Test
	void adapterTest() {
		List<Integer> list = List.of(1, 2, 3, 4, 5);
		Vector<Integer> vector = new Vector<>(list);
		Enumeration<Integer> elements = vector.elements();

		EnumerationIterator ei = new EnumerationIterator(elements);

		while (ei.hasNext()) {
			System.out.println(ei.next());
		}
	}

	@Test
	void adapterFailTest() {
		List<Integer> list = List.of(1, 2, 3, 4, 5);
		Vector<Integer> vector = new Vector<>(list);
		Enumeration<Integer> elements = vector.elements();

		EnumerationIterator ei = new EnumerationIterator(elements);

		assertThrows(UnsupportedOperationException.class, () -> ei.remove());

	}
}