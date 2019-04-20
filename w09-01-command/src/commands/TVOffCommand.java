package commands;

import remote.Command;
import sets.TV;

public class TVOffCommand implements Command  {

    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }

    @Override
    public void undo() {
        tv.turnOff();
    }

}
