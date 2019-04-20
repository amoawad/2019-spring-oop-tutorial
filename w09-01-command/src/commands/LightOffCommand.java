package commands;

import remote.Command;
import sets.Light;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOff();
    }

    @Override
    public void undo() {
        light.switchOn();
    }

}
