package io.npee.designpatterns._08_facade._02_facade;

public class Screen {
    String description;

    public Screen(String description) {
        this.description = description;
    }

    public void up() {
        System.out.println(description + " 상승");
    }

    public void down() {
        System.out.println(description + " 하강");
    }


    public String toString() {
        return description;
    }
}
