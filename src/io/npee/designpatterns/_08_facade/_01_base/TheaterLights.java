package io.npee.designpatterns._08_facade._01_base;

public class TheaterLights {
    String description;

    public TheaterLights(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " 켜기");
    }

    public void off() {
        System.out.println(description + " 끄기");
    }

    public void dim(int level) {
        System.out.println(description + " 밝기 조정 -> " + level  + "%");
    }

    public String toString() {
        return description;
    }
}
