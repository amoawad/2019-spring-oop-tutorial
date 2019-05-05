package states;

import machine.GumballMachine;

public class OutOfGumballsState extends State {

    public OutOfGumballsState(GumballMachine machine) {
        super(machine);
    }

    @Override
    public void insertCoin() {
        System.out.println("Sorry, we are sold out");
    }

    @Override
    public void ejectCoin() {
        System.out.println("يا نصاب، مفيش عملة، شطبنا");
    }

    @Override
    public void turnCrank() {
        System.out.println("معلش شطبنا");
    }

    @Override
    public void dispense() {
        System.out.println("Cannot despnse");
    }
}
