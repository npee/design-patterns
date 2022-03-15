package io.npee.designpatterns._06_command._04_home_automation_macro;

public class StereoOffCommand implements Command {

	Stereo stereo;

	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();
	}

	@Override
	public void undo() {
		stereo.on();
	}
}
