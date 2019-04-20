package commands;

import remote.Command;
import sets.Stereo;
import sets.TV;

public class StereoOnCommand implements Command  {

    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.powerOn();
        stereo.setVolume(10);
    }

    @Override
    public void undo() {
        stereo.setVolume(0);
        stereo.powerOff();
    }

}
