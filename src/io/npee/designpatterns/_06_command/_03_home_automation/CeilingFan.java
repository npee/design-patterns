package io.npee.designpatterns._06_command._03_home_automation;

public class CeilingFan {
	String location = "";
	int level;
	public static final int HIGH = 2;
	public static final int MEDIUM = 1;
	public static final int LOW = 0;

	public CeilingFan(String location) {
		this.location = location;
	}

	public void high() {
		level = HIGH;
		System.out.println(location + " 천장 팬 고속 회전");

	}

	public void medium() {
		level = MEDIUM;
		System.out.println(location + " 천장 팬 중속 회전");
	}

	public void low() {
		level = LOW;
		System.out.println(location + " 천장 팬 저속 회전");
	}

	public void off() {
		level = 0;
		System.out.println(location + " 천장 팬 꺼짐");
	}

	public int getSpeed() {
		return level;
	}
}
