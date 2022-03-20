package io.npee.designpatterns._09_templatemethod._02_template_method;

public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("차 우리기");
    }

    @Override
    public void addCondiments() {
        System.out.println("레몬 추가");
    }
}
