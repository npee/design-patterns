package io.npee.designpatterns._11_composit._03_add_iterator;

import java.util.Iterator;

public interface MenuComponent {

    default void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    default void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    default MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }
    default String getName() {
        throw new UnsupportedOperationException();
    }
    default String getDescription() {
        throw new UnsupportedOperationException();
    }
    default double getPrice() {
        throw new UnsupportedOperationException();
    }
    default boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }
    default void print() {
        throw new UnsupportedOperationException();
    }
    Iterator createIterator();
}
