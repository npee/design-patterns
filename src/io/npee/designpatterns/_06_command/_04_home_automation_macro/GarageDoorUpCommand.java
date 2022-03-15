package io.npee.designpatterns._06_command._04_home_automation_macro;

public class GarageDoorUpCommand implements Command {

	GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.up();
	}

	@Override
	public void undo() {
		garageDoor.down();
	}
}
