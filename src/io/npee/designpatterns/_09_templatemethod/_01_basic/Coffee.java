package io.npee.designpatterns._09_templatemethod._01_basic;

public class Coffee {

    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void boilWater() {
        System.out.println("물 끓이기");
    }

    public void brewCoffeeGrinds() {
        System.out.println("커피 거르기");
    }

    public void pourInCup() {
        System.out.println("컵에 따르기");
    }

    public void addSugarAndMilk() {
        System.out.println("설탕, 우유 추가");
    }
}
