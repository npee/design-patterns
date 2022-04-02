package io.npee.designpatterns._11_composit._03_add_iterator;

import java.util.HashMap;
import java.util.Iterator;

public class CafeMenu {

    HashMap<String, MenuItem> menuItems = new HashMap<String, MenuItem>();

    public CafeMenu() {
        addItem("베지 버거와 에어 프라이",
                "통밀 번, 양상추, 토마토, 감자튀김을 곁들인 베지 버거",
                true, 3.99);
        addItem("오늘의 스프",
                "사이드 샐러드를 곁들인 오늘의 스프",
                false, 3.69);
        addItem("브리또",
                "통 핀토빈과 살사, 과카몰이 곁들여진 거대한 브리또",
                true, 4.29);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
