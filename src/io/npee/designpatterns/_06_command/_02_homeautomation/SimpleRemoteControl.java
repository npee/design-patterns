package io.npee.designpatterns._06_command._02_homeautomation;

public class SimpleRemoteControl {

	Command slot;

	public void setCommand(Command command) {
		this.slot = command;
	}

	public void buttonPressed() {
		slot.execute();
	}
}