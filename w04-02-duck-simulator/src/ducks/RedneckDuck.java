package ducks;

import ducks.behaviors.FlyWithWings;

public class RedneckDuck extends Duck {

    public RedneckDuck() {
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm red");
    }
}
