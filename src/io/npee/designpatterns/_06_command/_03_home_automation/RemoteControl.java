package io.npee.designpatterns._06_command._03_home_automation;

public class RemoteControl {

	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;

	public RemoteControl() {
		this.onCommands = new Command[7];
		this.offCommands = new Command[7];

		NoCommand noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}

	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}

	public void undoButtonWasPushed() {
		undoCommand.undo();
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
		stringBuilder.append("[undo] ").append(undoCommand.getClass().getName()).append("\n");
		return stringBuilder.toString();
	}
}
