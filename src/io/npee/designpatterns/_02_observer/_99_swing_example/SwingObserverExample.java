package io.npee.designpatterns._02_observer._99_swing_example;

import java.awt.*;

import javax.swing.*;

public class SwingObserverExample {

	public static void main(String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}

	JFrame frame;

	public void go() {
		frame = new JFrame();
		JButton button = new JButton("정말 해도 될까?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);

		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}
