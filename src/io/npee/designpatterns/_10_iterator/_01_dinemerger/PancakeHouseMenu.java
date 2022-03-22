package io.npee.designpatterns._10_iterator._01_dinemerger;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {

    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B 팬케이크 아침 세트",
                "스크램블드 에그와 토스트가 곁들어진 팬케이크",
                true,
                2.99);

        addItem("레귤러 팬케이크 세트",
                "달걀 프라이와 소시지가 곁들여진 팬케이크",
                false,
                2.99);

        addItem("블루베리 팬케이크",
                "신선한 블루베리로 만든 팬케이크",
                true,
                3.49);

        addItem("와플",
                "블루베리 또는 딸기가 얹혀진 와플",
                true,
                3.59);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public String toString() {
        return "객체마을 팬케이크 식당 메뉴";
    }
}
