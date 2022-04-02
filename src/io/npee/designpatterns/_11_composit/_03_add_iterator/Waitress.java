package io.npee.designpatterns._11_composit._03_add_iterator;


public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {

        allMenus.print();
    }

}
