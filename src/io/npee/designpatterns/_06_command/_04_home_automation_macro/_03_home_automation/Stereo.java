package io.npee.designpatterns._06_command._04_home_automation_macro._03_home_automation;

public class Stereo {

	String location;

	public Stereo(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " 스테레오 켜짐");
	}

	public void off() {
		System.out.println(location + " 스테레오 꺼짐");
	}

	public void setCD() {
		System.out.println(location + " 스테레오 CD 입력 상태");
	}

	public void setDVD() {
		System.out.println(location + " 스테레오 DVD 입력 상태");
	}

	public void setRadio() {
		System.out.println(location + " 스테레오 라디오 입력 상태");
	}

	public void setVolume(int volume) {
		System.out.println(location + " 볼륨 " + volume + " 설정");
	}
}
