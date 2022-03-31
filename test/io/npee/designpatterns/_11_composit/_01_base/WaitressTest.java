package io.npee.designpatterns._11_composit._01_base;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class WaitressTest {

    @Test
    void waitressTest() {

        Menu dinerMenu = new DinerMenu();
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu cafeMenu = new CafeMenu();

        List<Menu> menus = List.of(dinerMenu, pancakeHouseMenu, cafeMenu);

        Waitress waitress = new Waitress(menus);

        waitress.printMenu();
    }

}