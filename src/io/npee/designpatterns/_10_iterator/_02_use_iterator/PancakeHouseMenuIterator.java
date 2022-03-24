package io.npee.designpatterns._10_iterator._02_use_iterator;

import java.util.List;

public class PancakeHouseMenuIterator implements CustomIterator {

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
