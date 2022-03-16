package io.npee.designpatterns._07_adapter._02_enumeration_iterator;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Test;

class IteratorEnumerationTest {

    @Test
    void iteratorEnumerationTest() {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Iterator<Integer> iterator = list.iterator();
        IteratorEnumeration ie = new IteratorEnumeration(iterator);

        while (ie.hasMoreElements()) {
            System.out.println(ie.nextElement());
        }
    }
}