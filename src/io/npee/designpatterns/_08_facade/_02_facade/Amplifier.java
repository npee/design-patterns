package io.npee.designpatterns._08_facade._02_facade;

public class Amplifier {
    String description;
    Tuner tuner;
    StreamingPlayer player;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " 켜기");
    }

    public void off() {
        System.out.println(description + " 끄기");
    }

    public void setStereoSound() {
        System.out.println(description + " 스테레오 모드 켜기");
    }

    public void setSurroundSound() {
        System.out.println(description + " 서라운드 사운드 켜기 (5 스피커, 1 보조 우퍼)");
    }

    public void setVolume(int level) {
        System.out.println(description + " 의 볼륨을 " + level + " 으로 설정");
    }

    public void setTuner(Tuner tuner) {
        System.out.println(description + " 의 튜너를 " + tuner + " 으로 설정");
        this.tuner = tuner;
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        System.out.println(description + " 의 스트리밍 플레이어를 " + player + " 으로 설정");
        this.player = player;
    }

    public String toString() {
        return description;
    }
}
