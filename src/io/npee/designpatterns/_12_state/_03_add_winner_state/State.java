package io.npee.designpatterns._12_state._03_add_winner_state;

public interface State {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void refill();
}
