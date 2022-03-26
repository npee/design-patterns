package io.npee.designpatterns._10_iterator._03_improve_interface;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WaitressTest {

    @Test
    void waitressTest() {

        Menu dinerMenu = new DinerMenu();
        Menu pancakeHouseMenu = new PancakeHouseMenu();

        Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu);

        waitress.printMenu();
    }
}