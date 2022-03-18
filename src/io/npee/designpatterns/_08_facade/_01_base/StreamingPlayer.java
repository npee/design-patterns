package io.npee.designpatterns._08_facade._01_base;

public class StreamingPlayer {
    String description;
    int currentChapter;
    Amplifier amplifier;
    String movie;

    public StreamingPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println(description + " 켜기");
    }

    public void off() {
        System.out.println(description + " 끄기");
    }

    public void play(String movie) {
        this.movie = movie;
        currentChapter = 0;
        System.out.println(description + " 영화 재생 ->  \"" + movie + "\"");
    }

    public void play(int chapter) {
        if (movie == null) {
            System.out.println(description + " 는 챕터 " + chapter + "의 영화를 재생할 수 없습니다.");
        } else {
            currentChapter = chapter;
            System.out.println(description + " 가 챕터 " + currentChapter + " 의 영화를 재생중입니다. -> \"" + movie + "\"");
        }
    }

    public void stop() {
        currentChapter = 0;
        System.out.println(description + " 재생 중지 -> \"" + movie + "\"");
    }

    public void pause() {
        System.out.println(description + " 일시정지 -> \"" + movie + "\"");
    }

    public void setTwoChannelAudio() {
        System.out.println(description + " 2 채널 오디오 설정");
    }

    public void setSurroundAudio() {
        System.out.println(description + " 서라운드 오디오 설정");
    }

    public String toString() {
        return description;
    }
}
