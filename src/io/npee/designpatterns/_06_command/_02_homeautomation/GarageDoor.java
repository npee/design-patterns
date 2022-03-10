package io.npee.designpatterns._06_command._02_homeautomation;

public class GarageDoor {

	public void up() {
		System.out.println("차고 문 열림");
	}

	public void down() {
		System.out.println("차고 문 닫힘");
	}

	public void stop() {
		System.out.println("차고 문 정지");
	}

	public void lightOn() {
		System.out.println("차고 불 켜짐");
	}

	public void lightOff() {
		System.out.println("차고 불 꺼짐");
	}
}
