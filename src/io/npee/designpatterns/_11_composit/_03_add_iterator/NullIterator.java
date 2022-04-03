package io.npee.designpatterns._11_composit._03_add_iterator;

import java.util.Iterator;

public class NullIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
