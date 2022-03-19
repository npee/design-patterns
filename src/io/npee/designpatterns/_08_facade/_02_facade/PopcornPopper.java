package io.npee.designpatterns._08_facade._02_facade;

public class PopcornPopper {
    String description;

    public PopcornPopper(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " 켜기");
    }

    public void off() {
        System.out.println(description + " 끄기");
    }

    public void pop() {
        System.out.println(description + "가 팝콘을 튀기는 중입니다.");
    }


    public String toString() {
        return description;
    }
}
