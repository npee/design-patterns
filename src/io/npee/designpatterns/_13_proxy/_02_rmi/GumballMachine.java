package io.npee.designpatterns._13_proxy._02_rmi;

import java.rmi.RemoteException;

public class GumballMachine implements GumballMachineRemote {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    String location;

    State state;
    int count = 0;

    public GumballMachine(String location, int count) throws RemoteException {
        this.location = location;
        this.count = count;
    }

    public GumballMachine(int numberGumballs, String location) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }

        this.location = location;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("풍선껌이 나오고 있습니다.");
        if (count > 0) {
            count = count - 1;
        }
    }

    public int getCount() {
        return count;
    }

    public void refill(int count) {
        this.count += count;
        System.out.println("풍선껌이 충전되었습니다. 새 풍선껌의 개수 : " + this.count);
        state.refill();
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("기계가 " + state + "\n");
        return result.toString();
    }

    public String getLocation() {
        return location;
    }
}
