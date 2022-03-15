package io.npee.designpatterns._06_command._04_home_automation_macro;

public class StereoOnCommand implements Command {

	Stereo stereo;

	public StereoOnCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
	}

	@Override
	public void undo() {
		stereo.off();
	}
}
