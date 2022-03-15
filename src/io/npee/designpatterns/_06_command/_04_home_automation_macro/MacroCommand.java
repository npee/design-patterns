package io.npee.designpatterns._06_command._04_home_automation_macro;

public class MacroCommand implements Command {

	Command[] commands;

	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}

	@Override
	public void execute() {
		for (Command command : commands) {
			command.execute();
		}
	}

	@Override
	public void undo() {
		for (Command command : commands) {
			command.undo();
		}
	}
}
