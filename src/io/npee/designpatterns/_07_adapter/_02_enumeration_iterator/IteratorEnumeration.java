package io.npee.designpatterns._07_adapter._02_enumeration_iterator;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration implements Enumeration {

    private Iterator iterator;

    public IteratorEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
