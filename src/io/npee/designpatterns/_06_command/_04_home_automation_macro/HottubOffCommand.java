package io.npee.designpatterns._06_command._04_home_automation_macro;

public class HottubOffCommand implements Command {

	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	@Override
	public void execute() {
		hottub.off();
	}

	@Override
	public void undo() {
		hottub.on();
		hottub.setTemperature(104);
		hottub.circulate();
	}
}
