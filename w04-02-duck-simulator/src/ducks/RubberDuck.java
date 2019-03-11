package ducks;

import ducks.behaviors.CannotFly;
import ducks.behaviors.FlyWithWings;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new CannotFly();
    }

    @Override
    public void display() {
        System.out.println("I'm yellow");
    }
}
