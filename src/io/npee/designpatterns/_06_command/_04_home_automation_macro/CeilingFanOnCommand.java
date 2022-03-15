package io.npee.designpatterns._06_command._04_home_automation_macro;

public class CeilingFanOnCommand implements Command {

	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.low();
	}

	@Override
	public void undo() {
		ceilingFan.off();
	}
}
