package states;

import machine.GumballMachine;

public abstract class State {

    protected GumballMachine machine;

    public State(GumballMachine machine) {
        this.machine = machine;
    }

    public abstract void insertCoin();
    public abstract void ejectCoin();
    public abstract void turnCrank();
    public abstract void dispense();

}
