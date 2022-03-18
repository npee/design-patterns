package io.npee.designpatterns._08_facade._01_base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TheaterTest {

    @Test
    void theaterTest() {
        PopcornPopper popper = new PopcornPopper("팝콘 기계");
        popper.on();
        popper.pop();

        TheaterLights lights = new TheaterLights("영화 조명");
        lights.dim(10);

        Screen screen = new Screen("스크린");
        screen.down();

        Amplifier amp = new Amplifier("증폭기");
        StreamingPlayer st = new StreamingPlayer("스트리밍 플레이어", amp);
        Projector projector = new Projector("프로젝터", st);
        projector.wideScreenMode();

        amp.on();
        amp.setStreamingPlayer(st);
        amp.setSurroundSound();
        amp.setVolume(5);

        st.on();
        st.play("something movie");
    }

}