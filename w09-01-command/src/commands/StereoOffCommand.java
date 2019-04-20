package commands;

import remote.Command;
import sets.Stereo;

public class StereoOffCommand implements Command  {

    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.setVolume(0);
        stereo.powerOff();
    }

    @Override
    public void undo() {
        stereo.powerOn();
        stereo.setVolume(10);
    }

}
