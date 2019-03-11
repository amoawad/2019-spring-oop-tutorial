package ducks.behaviors;

public class FlyWithWings implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I believe I can fly with my wings");
    }
}
