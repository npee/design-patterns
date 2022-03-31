package io.npee.designpatterns._11_composit._02_menu_component;


import java.util.Iterator;
import java.util.List;

public class Waitress {

    List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {

        Iterator<Menu> menuIterator = menus.iterator();

        while (menuIterator.hasNext()) {
            Menu menu = menuIterator.next();
            printMenu(menu.createIterator());
        }

//        System.out.println("MENU\n----\nBREAKFAST");
//        System.out.println("\nLUNCH");
//        System.out.println("\nDINNER");
    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
    }
}
