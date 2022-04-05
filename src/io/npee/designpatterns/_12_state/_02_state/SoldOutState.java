package io.npee.designpatterns._12_state._02_state;

public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("매진되었으므로 동전을 더 이상 넣을 수 없습니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣지 않았습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("더 이상 풍선껌이 없습니다.");
    }

    @Override
    public void dispense() {
        System.out.println("풍선껌이 없습니다.");
    }

    @Override
    public void refill() {

    }

    @Override
    public String toString() {
        return "보유한 풍선껌이 매진입니다.";
    }
}
