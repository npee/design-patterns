package io.npee.designpatterns._09_templatemethod._03_with_hook;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaffeineBeverageWithHookTest {

    @Test
    void baristaHookTest() {
        CoffeeWithHook coffee = new CoffeeWithHook();
        TeaWithHook tea = new TeaWithHook();

        coffee.prepareRecipe();

        tea.prepareRecipe();
    }

}