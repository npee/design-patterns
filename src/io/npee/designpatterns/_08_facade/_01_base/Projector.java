package io.npee.designpatterns._08_facade._01_base;

public class Projector {
    String description;
    StreamingPlayer player;

    public Projector(String description, StreamingPlayer player) {
        this.description = description;
        this.player = player;
    }

    public void on() {
        System.out.println(description + " 켜기");
    }

    public void off() {
        System.out.println(description + " 끄기");
    }

    public void wideScreenMode() {
        System.out.println(description + " 와이드스크린 모드 (16x9)");
    }

    public void tvMode() {
        System.out.println(description + " TV 모드 (4x3)");
    }

    public String toString() {
        return description;
    }
}
