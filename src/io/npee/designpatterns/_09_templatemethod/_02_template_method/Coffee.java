package io.npee.designpatterns._09_templatemethod._02_template_method;

public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("커피 거르기");
    }

    @Override
    public void addCondiments() {
        System.out.println("설탕, 우유 추가");
    }
}
