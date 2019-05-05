package states;

import machine.GumballMachine;

public class GumballSoldState extends State {

    public GumballSoldState(GumballMachine machine) {
        super(machine);
    }

    @Override
    public void insertCoin() {
        System.out.println("Please wait, I'm already dispensing a gumball");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Too late, you cannot eject your coin now");
    }

    @Override
    public void turnCrank() {
        System.out.println("معلش، مش هنزلك واحدة تانية");
    }

    @Override
    public void dispense() {
        System.out.println("here's your gumball");
        machine.release(1);
        if(machine.getGumballs() == 0) {
            machine.changeState(machine.getOUT_OF_GUMBALLS());
        } else {
            machine.changeState(machine.getNO_COIN());
        }
    }
}
