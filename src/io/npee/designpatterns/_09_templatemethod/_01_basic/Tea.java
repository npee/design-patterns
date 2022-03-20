package io.npee.designpatterns._09_templatemethod._01_basic;

public class Tea {

    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void boilWater() {
        System.out.println("물 끓이기");
    }

    public void steepTeaBag() {
        System.out.println("차 우리기");
    }

    public void pourInCup() {
        System.out.println("컵에 따르기");
    }

    public void addLemon() {
        System.out.println("레몬 추가");
    }
}
