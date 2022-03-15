package io.npee.designpatterns._06_command._04_home_automation_macro._03_home_automation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoteControlTest {

	@Test
	void macroTest() {

		RemoteControl remoteControl = new RemoteControl();

		Light light = new Light("거실");
		TV tv = new TV("거실");
		Stereo stereo = new Stereo("거실");
		Hottub hottub = new Hottub();

		LightOnCommand lightOn = new LightOnCommand(light);
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		TVOnCommand tvOn = new TVOnCommand(tv);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);

		LightOffCommand lightOff = new LightOffCommand(light);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		TVOffCommand tvOff = new TVOffCommand(tv);
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);

		Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn};
		Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff};

		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);

		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

		System.out.println(remoteControl);
		System.out.println("--- 매크로 버튼 on ---");
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- 매크로 버튼 Off---");
		remoteControl.offButtonWasPushed(0);
	}

}