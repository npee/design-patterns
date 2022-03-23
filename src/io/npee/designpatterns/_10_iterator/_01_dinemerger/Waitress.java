package io.npee.designpatterns._10_iterator._01_dinemerger;

import java.util.List;

public class Waitress {

    DinerMenu dinerMenu;
    PancakeHouseMenu pancakeHouseMenu;

    public Waitress(DinerMenu dinerMenu, PancakeHouseMenu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu() {
        MenuItem[] dinerMenuItems = dinerMenu.getMenuItems();
        List<MenuItem> pancakeHouseMenuItems = pancakeHouseMenu.getMenuItems();

        System.out.println("MENU\n----\nBREAKFAST");
        for (MenuItem dinerMenuItem : dinerMenuItems) {
            System.out.print(dinerMenuItem.getName() + " ");
            System.out.println(dinerMenuItem.getPrice() + " ");
            System.out.println(dinerMenuItem.getDescription());
        }
        System.out.println("\nLUNCH");
        for (MenuItem pancakeHouseMenuItem : pancakeHouseMenuItems) {
            System.out.print(pancakeHouseMenuItem.getName() + " ");
            System.out.println(pancakeHouseMenuItem.getPrice() + " ");
            System.out.println(pancakeHouseMenuItem.getDescription());
        }
    }
}
