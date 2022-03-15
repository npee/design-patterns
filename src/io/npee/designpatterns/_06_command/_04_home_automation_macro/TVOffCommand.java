package io.npee.designpatterns._06_command._04_home_automation_macro;

public class TVOffCommand implements Command {

	TV tv;

	public TVOffCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.off();
	}

	@Override
	public void undo() {
		tv.on();
	}
}
