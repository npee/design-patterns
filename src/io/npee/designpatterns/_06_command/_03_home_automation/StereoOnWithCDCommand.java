package io.npee.designpatterns._06_command._03_home_automation;

public class StereoOnWithCDCommand implements Command {

	Stereo stereo;

	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}
}