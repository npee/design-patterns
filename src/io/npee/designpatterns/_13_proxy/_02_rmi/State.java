package io.npee.designpatterns._13_proxy._02_rmi;

import java.io.Serializable;

public interface State extends Serializable {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void refill();
}
