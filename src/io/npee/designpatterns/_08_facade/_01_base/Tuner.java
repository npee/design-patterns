package io.npee.designpatterns._08_facade._01_base;

public class Tuner {
    String description;
    Amplifier amplifier;
    double frequency;

    public Tuner(String description, Amplifier amplifier) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " 켜기");
    }

    public void off() {
        System.out.println(description + " 끄기");
    }

    public void setFrequency(double frequency) {
        System.out.println(description + " 의 주파수를 " + frequency + "으로 설정");
        this.frequency = frequency;
    }

    public void setAm() {
        System.out.println(description + " 을 AM 모드로 설정");
    }

    public void setFm() {
        System.out.println(description + " 을 FM 모드로 설정");
    }

    public String toString() {
        return description;
    }
}