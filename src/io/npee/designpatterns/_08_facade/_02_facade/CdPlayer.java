package io.npee.designpatterns._08_facade._02_facade;

public class CdPlayer {
    String description;
    int currentTrack;
    Amplifier amplifier;
    String title;

    public CdPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println(description + " 켜기");
    }

    public void off() {
        System.out.println(description + " 끄기");
    }

    public void eject() {
        title = null;
        System.out.println(description + " CD 꺼내기");
    }

    public void play(String title) {
        this.title = title;
        currentTrack = 0;
        System.out.println(description + " 재생중 -> \"" + title + "\"");
    }

    public void play(int track) {
        if (title == null) {
            System.out.println(description + " 가 트랙 " + currentTrack +
                               "을 재생할 수 없습니다.");
        } else {
            currentTrack = track;
            System.out.println(description + " 재생 중 -> 트랙 " + currentTrack);
        }
    }

    public void stop() {
        currentTrack = 0;
        System.out.println(description + " 중지");
    }

    public void pause() {
        System.out.println(description + " 일시정지 -> \"" + title + "\"");
    }

    public String toString() {
        return description;
    }
}
