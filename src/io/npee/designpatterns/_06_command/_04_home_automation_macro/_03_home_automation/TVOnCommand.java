package io.npee.designpatterns._06_command._04_home_automation_macro._03_home_automation;

public class TVOnCommand implements Command {

	TV tv;

	public TVOnCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.on();
		tv.setInputChannel();
	}

	@Override
	public void undo() {
		tv.off();
	}
}
