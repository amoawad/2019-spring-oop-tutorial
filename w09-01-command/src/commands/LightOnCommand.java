package commands;

import remote.Command;
import sets.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOn();
    }

    @Override
    public void undo() {
        light.switchOff();
    }

}
