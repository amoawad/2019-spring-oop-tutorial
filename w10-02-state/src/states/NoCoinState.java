package states;

import machine.GumballMachine;

public class NoCoinState extends State {

    public NoCoinState(GumballMachine machine) {
        super(machine);
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin accepted");
        machine.changeState(machine.getHAS_COIN());
    }

    @Override
    public void ejectCoin() {
        System.out.println("يا نصاب، مفيش عملة أصلاً");
    }

    @Override
    public void turnCrank() {
        System.out.println("ﻻ ناصح ياض، المفروض تحط عملة الأول");
    }

    @Override
    public void dispense() {
        System.out.println("Cannot despense");
    }
}
