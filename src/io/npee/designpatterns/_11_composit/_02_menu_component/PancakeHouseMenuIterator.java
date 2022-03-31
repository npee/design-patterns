package io.npee.designpatterns._11_composit._02_menu_component;

import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {

    List<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size() && items.get(position) != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }
}
