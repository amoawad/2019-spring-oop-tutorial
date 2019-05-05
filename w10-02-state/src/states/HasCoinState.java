package states;

import machine.GumballMachine;

import java.util.Random;

public class HasCoinState extends State {

    public HasCoinState(GumballMachine machine) {
        super(machine);
    }

    @Override
    public void insertCoin() {
        System.out.println("Sorry, there's a coin in the machine!");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Here's your coin, come again later");
        machine.changeState(machine.getNO_COIN());
    }

    @Override
    public void turnCrank() {
        System.out.println("OK, I will depense a gumball for you");
        Random random = new Random();
        boolean isWinner = random.nextBoolean();
        if(isWinner) {
            System.out.println("*** TADAAAA, you WIN!! ***");
            machine.changeState(machine.getWINNER());
        } else {
            machine.changeState(machine.getSOLD());
        }
    }

    @Override
    public void dispense() {
        System.out.println("Cannot despense");
    }
}
