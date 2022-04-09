package io.npee.designpatterns._13_proxy._02_rmi;

public interface State {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void refill();
}
