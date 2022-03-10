package io.npee.designpatterns._06_command._02_simple_home_automation;

import org.junit.jupiter.api.Test;

class SimpleRemoteControlTest {

	@Test
	void remoteControlTest() {
		SimpleRemoteControl rc = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);

		rc.setCommand(lightOn);
		rc.buttonPressed();
	}

	@Test
	void garageDoorOpenTest() {
		SimpleRemoteControl rc = new SimpleRemoteControl();
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

		rc.setCommand(lightOn);
		rc.buttonPressed();
		rc.setCommand(garageDoorOpen);
		rc.buttonPressed();
	}
}