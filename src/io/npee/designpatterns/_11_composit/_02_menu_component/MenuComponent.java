package io.npee.designpatterns._11_composit._02_menu_component;

public interface MenuComponent {

    default void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    default void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    default MenuComponent getChild() {
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
}
