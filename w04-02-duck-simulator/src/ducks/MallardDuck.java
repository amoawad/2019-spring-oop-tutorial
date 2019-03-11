package ducks;

import ducks.behaviors.FlyWithWings;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm green");
    }
}
