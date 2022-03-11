package io.npee.designpatterns._06_command._03_home_automation;

public class CeilingFanOffCommand implements Command {

	CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.off();
	}
}
