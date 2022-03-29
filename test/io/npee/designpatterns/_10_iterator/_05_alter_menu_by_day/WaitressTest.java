package io.npee.designpatterns._10_iterator._05_alter_menu_by_day;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WaitressTest {

    @Test
    void waitressTest() {

        Menu dinerMenu = new DinerMenu();
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu, cafeMenu);

        waitress.printMenu();
    }

}