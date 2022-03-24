package io.npee.designpatterns._10_iterator._02_use_iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Waitress {

    DinerMenu dinerMenu;
    PancakeHouseMenu pancakeHouseMenu;

    public Waitress(DinerMenu dinerMenu, PancakeHouseMenu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu() {
        MenuItem[] lunchItems = dinerMenu.getMenuItems();
        List<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

        System.out.println("MENU\n----\nBREAKFAST");
        for (MenuItem menuItem : breakfastItems) {
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
        System.out.println("\nLUNCH");
        for (MenuItem menuItem : lunchItems) {
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
    }

    public void printMenuWithIterator() {
        Iterator<MenuItem> lunchItemsIterator = Arrays.stream(dinerMenu.getMenuItems()).iterator();
        Iterator<MenuItem> breakfastItemsIterator = pancakeHouseMenu.getMenuItems().iterator();

        System.out.println("MENU\n----\nBREAKFAST");
        while (breakfastItemsIterator.hasNext()) {
            MenuItem menuItem = breakfastItemsIterator.next();
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
        System.out.println("\nLUNCH");
        while(lunchItemsIterator.hasNext()) {
            MenuItem menuItem = lunchItemsIterator.next();
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }

    }
}
