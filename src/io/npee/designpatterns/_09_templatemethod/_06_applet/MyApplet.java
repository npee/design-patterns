package io.npee.designpatterns._09_templatemethod._06_applet;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {

    String message;

    @Override
    public void init() {
        message = "안녕하세요";
        repaint();
    }

    @Override
    public void start() {
        message = "시작 중";
        repaint();
    }

    @Override
    public void stop() {
        message = "안녕히 가세요";
        repaint();
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(message, 5, 15);
    }
}
