package io.npee.designpatterns._08_facade._02_facade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HomeTheaterFacadeTest {

    @Test
    void homeTheaterFacadeTest() {
        PopcornPopper popper = new PopcornPopper("팝콘 기계");
        TheaterLights lights = new TheaterLights("영화 조명");
        Screen screen = new Screen("스크린");
        Amplifier amp = new Amplifier("증폭기");
        Tuner tuner = new Tuner("튜너", amp);
        StreamingPlayer st = new StreamingPlayer("스트리밍 플레이어", amp);
        Projector projector = new Projector("프로젝터", st);

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, st, projector, screen, lights, popper);
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }

}