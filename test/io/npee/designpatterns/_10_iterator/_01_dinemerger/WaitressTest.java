package io.npee.designpatterns._10_iterator._01_dinemerger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WaitressTest {

    @Test
    void waitressTest() {

        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

        Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu);

        waitress.printMenu();
    }

}