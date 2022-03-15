package io.npee.designpatterns._06_command._04_home_automation_macro;

public class LightOffCommand implements Command {

	Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}
}
