package io.npee.designpatterns._06_command._04_home_automation_macro._03_home_automation;

public class Light {

	String location;

	public Light(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println("불 켜짐");
	}

	public void off() {
		System.out.println("불 꺼짐");
	}
}
