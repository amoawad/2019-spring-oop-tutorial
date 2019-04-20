package commands;

import remote.Command;

public class PartyCommand implements Command {

    private Command[] commands;

    public PartyCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for(Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for(int i = commands.length -1; i > -1; i--) {
            commands[i].undo();
        }
    }
}
