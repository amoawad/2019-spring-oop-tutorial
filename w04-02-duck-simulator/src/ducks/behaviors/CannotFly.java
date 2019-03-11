package ducks.behaviors;

public class CannotFly implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
}
