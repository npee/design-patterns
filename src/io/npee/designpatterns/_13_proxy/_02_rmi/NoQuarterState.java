package io.npee.designpatterns._13_proxy._02_rmi;

public class NoQuarterState implements State {

    transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전을 이미 넣었습니다.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣어주세요.");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전을 넣어주세요.");
    }

    @Override
    public void dispense() {
        System.out.println("동전을 넣어주세요.");
    }

    @Override
    public void refill() {

    }

    @Override
    public String toString() {
        return "동전을 넣어주세요.";
    }
}
