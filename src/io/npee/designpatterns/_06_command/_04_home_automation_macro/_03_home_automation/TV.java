package io.npee.designpatterns._06_command._04_home_automation_macro._03_home_automation;

public class TV {
	String location;
	int channel;

	public TV(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " TV 켜짐");
	}

	public void off() {
		System.out.println(location + " TV 꺼짐");
	}

	public void setInputChannel() {
		this.channel = 3;
		System.out.println(location + " TV 입력 채널 설정됨");
	}
}
