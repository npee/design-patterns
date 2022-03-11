package io.npee.designpatterns._06_command._03_home_automation;

public class RemoteControl {

	Command[] onCommands;
	Command[] offCommands;

	public RemoteControl() {
		this.onCommands = new Command[7];
		this.offCommands = new Command[7];

		NoCommand noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}

	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("\n------ Remote Control ------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuilder.append("[slot ")
				.append(i)
				.append("]")
				.append(onCommands[i].getClass().getName())
				.append("\t")
				.append(offCommands[i].getClass().getName())
				.append("\n");
		}
		return stringBuilder.toString();
	}
}
