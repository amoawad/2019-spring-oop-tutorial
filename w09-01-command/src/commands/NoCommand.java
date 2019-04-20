package commands;

import remote.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Sorry, I don't know what to do");
    }

    @Override
    public void undo() {
        System.out.println("Didn't do anything in the first place");
    }
}
