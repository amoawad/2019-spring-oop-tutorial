package remote;

import commands.NoCommand;

public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;

    private Command lastCommand;

    public RemoteControl() {
        this.onCommands = new Command[3];
        this.offCommands = new Command[3];

        for(int i = 0; i < 3; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }

        lastCommand = new NoCommand();
    }

    public void addOnCommand(Command onCommand, int position) {
        this.onCommands[position] = onCommand;
    }

    public void addOffCommand(Command offCommand, int position) {
        this.offCommands[position] = offCommand;
    }

    public void pushOnButton(int index) {
        onCommands[index].execute();
        lastCommand = onCommands[index];
    }

    public void pushOffButton(int index) {
        offCommands[index].execute();
        lastCommand = offCommands[index];
    }

    public void undo() {
        System.out.println("----------- UNDO");
        lastCommand.undo();
    }

}
