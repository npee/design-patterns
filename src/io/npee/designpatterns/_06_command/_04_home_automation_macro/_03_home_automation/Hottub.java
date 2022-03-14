package io.npee.designpatterns._06_command._04_home_automation_macro._03_home_automation;

public class Hottub {
	boolean on;
	int temperature;

	public Hottub() {
	}

	public void on() {
		on = true;
	}

	public void off() {
		on = false;
	}

	public void circulate() {
		if (on) {
			System.out.println("스파에 거품이 생기고 있습니다.");
		}
	}

	public void jetsOn() {
		if (on) {
			System.out.println("제트스파 켜짐");
		}
	}

	public void jetsOff() {
		if (on) {
			System.out.println("제트스파 꺼짐");
		}
	}

	public void setTemperature(int temperature) {
		if (temperature > this.temperature) {
			System.out.println("스파가 " + temperature + " 도로 데워지는 중입니다.");
		}
		else {
			System.out.println("스파가 " + temperature + " 도로 식는 중입니다.");
		}
		this.temperature = temperature;
	}
}
