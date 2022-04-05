package io.npee.designpatterns._12_state._03_add_winner_state;

public class HasQuarterState implements State {

    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전은 하나만 넣을 수 있습니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 반환합니다.");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("크랭크를 움직였습니다.");
        gumballMachine.setState(gumballMachine.getSoldState());
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
        return "크랭크를 움직일 준비가 되었습니다.";
    }
}
