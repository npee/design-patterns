package io.npee.designpatterns._09_templatemethod._02_template_method;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("물 끓이기");
    }

    void pourInCup() {
        System.out.println("컵에 따르기");
    }

}
