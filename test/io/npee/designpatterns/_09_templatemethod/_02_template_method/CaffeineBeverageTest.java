package io.npee.designpatterns._09_templatemethod._02_template_method;

import org.junit.jupiter.api.Test;

class CaffeineBeverageTest {

    @Test
    void baristaTest() {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        coffee.prepareRecipe();

        tea.prepareRecipe();
    }
}