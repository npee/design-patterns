package io.npee.designpatterns._11_composit._01_base;


import java.util.Iterator;

public class Waitress {

    Menu dinerMenu;
    Menu pancakeHouseMenu;
    Menu cafeMenu;

    public Waitress(Menu dinerMenu, Menu pancakeHouseMenu, Menu cafeMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator breakfastIterator = pancakeHouseMenu.createIterator();
        Iterator lunchIterator = dinerMenu.createIterator();
        Iterator dinnerIterator = cafeMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(breakfastIterator);
        System.out.println("\nLUNCH");
        printMenu(lunchIterator);
        System.out.println("\nDINNER");
        printMenu(dinnerIterator);
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
