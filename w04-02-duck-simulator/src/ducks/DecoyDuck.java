package ducks;

import ducks.behaviors.CannotFly;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new CannotFly();
    }

    @Override
    public void display() {
        System.out.println("I'm brown");
    }
}
