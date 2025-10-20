package patterns.structural.bridge.example2;

import patterns.structural.bridge.example2.abstraction.AdvancedRemoteControl;
import patterns.structural.bridge.example2.abstraction.BasicRemoteControl;
import patterns.structural.bridge.example2.abstraction.RemoteControl;
import patterns.structural.bridge.example2.implementation.RadioDevice;
import patterns.structural.bridge.example2.implementation.TvDevice;

public class Application {
    public static void main(String[] args) {
        RemoteControl basicTvRemoteControl = new BasicRemoteControl(new TvDevice());
        RemoteControl advancedRadioRemoteControl = new AdvancedRemoteControl(new RadioDevice());

        basicTvRemoteControl.togglePower();
        basicTvRemoteControl.volumeUp();
        ((AdvancedRemoteControl) advancedRadioRemoteControl).mute();

        basicTvRemoteControl.togglePower();
    }
}
