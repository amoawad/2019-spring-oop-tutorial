import commands.*;
import remote.RemoteControl;
import sets.Light;
import sets.Stereo;
import sets.TV;

public class Main {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        TV tv = new TV();
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        TVOffCommand tvOffCommand = new TVOffCommand(tv);

        Stereo stereo = new Stereo();
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.addOnCommand(lightOnCommand, 0);

        remoteControl.addOffCommand(lightOffCommand, 0);

        remoteControl.pushOnButton(0);
        remoteControl.undo();

        remoteControl.pushOffButton(0);

        remoteControl.undo();

        remoteControl.pushOnButton(1);

    }

}
