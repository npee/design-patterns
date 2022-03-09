package io.npee.designpatterns._06_command._02_homeautomation;

import static org.junit.jupiter.api.Assertions.*;

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

}