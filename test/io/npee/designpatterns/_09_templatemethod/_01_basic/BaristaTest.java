package io.npee.designpatterns._09_templatemethod._01_basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BaristaTest {

    @Test
    void baristaTest() {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        coffee.prepareRecipe();

        tea.prepareRecipe();
    }
}