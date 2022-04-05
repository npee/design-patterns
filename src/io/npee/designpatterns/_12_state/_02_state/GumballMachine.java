package io.npee.designpatterns._12_state._02_state;

public class GumballMachine {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("동전은 하나만 넣을 수 있습니다.");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("동전을 이미 넣었습니다.");
        } else if (state == SOLD_OUT) {
            System.out.println("매진되었으므로 동전을 더 이상 넣을 수 없습니다.");
        } else if (state == SOLD) {
            System.out.println("잠시만 기다려주세요. 풍선껌이 나가고 있습니다.");
        }
    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("동전을 반환합니다.");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요.");
        } else if (state == SOLD) {
            System.out.println("죄송합니다. 이미 크랭크를 움직였습니다.");
        } else if (state == SOLD_OUT) {
            System.out.println("동전을 넣지 않았습니다.");
        }
    }

    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("크랭크는 한 번만 움직여 주세요.");
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요.");
        } else if (state == SOLD_OUT) {
            System.out.println("더 이상 풍선껌이 없습니다.");
        } else if (state == HAS_QUARTER) {
            System.out.println("크랭크를 움직였습니다.");
            state = SOLD;
            dispense();
        }
    }

    private void dispense() {
        if (state == SOLD) {
            System.out.println("풍선껌이 나오고 있습니다.");
            count = count - 1;
            if (count == 0) {
                System.out.println("풍선껌이 없습니다.");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요.");
        } else if (state == SOLD_OUT) {
            System.out.println("풍선껌이 없습니다.");
        } else if (state == HAS_QUARTER) {
            System.out.println("풍선껌이 없습니다.");
        }
    }

    public void refill(int numGumBalls) {
        this.count = numGumBalls;
        state = NO_QUARTER;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n기계가 ");
        if (state == SOLD_OUT) {
            result.append("보유한 풍선껌이 매진입니다.");
        } else if (state == NO_QUARTER) {
            result.append("동전을 기다리고 있습니다.");
        } else if (state == HAS_QUARTER) {
            result.append("크랭크를 움직일 준비가 되었습니다.");
        } else if (state == SOLD) {
            result.append("풍선껌을 내보내는 중입니다.");
        }
        result.append("\n");
        return result.toString();
    }

}
