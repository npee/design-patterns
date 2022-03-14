package io.npee.designpatterns._06_command._04_home_automation_macro._03_home_automation;

public class HottubOnCommand implements Command {

	Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	@Override
	public void execute() {
		hottub.on();
		hottub.setTemperature(104);
		hottub.circulate();
	}

	@Override
	public void undo() {
		hottub.off();
	}
}
