package io.npee.designpatterns._06_command._03_home_automation;

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
