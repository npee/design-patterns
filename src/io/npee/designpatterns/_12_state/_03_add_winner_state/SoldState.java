package io.npee.designpatterns._12_state._03_add_winner_state;

public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("잠시만 기다려주세요. 풍선껌이 나가고 있습니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("죄송합니다. 이미 크랭크를 움직였습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("크랭크는 한 번만 움직여 주세요.");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("풍선껌이 없습니다.");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("풍선껌이 나오고 있습니다.");
    }

    @Override
    public void refill() {

    }

    @Override
    public String toString() {
        return "풍선껌을 내보내는 중입니다.";
    }
}
