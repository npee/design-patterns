package io.npee.designpatterns._11_composit._02_menu_component;


public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {

        allMenus.print();
    }

}
