import ducks.*;
import ducks.behaviors.FlyWithRocket;

public class DuckSimulator {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        Duck redneck = new RedneckDuck();
        Duck rubber = new RubberDuck();
        Duck decoy = new DecoyDuck();

        simulateDuck(mallard);
        simulateDuck(redneck);
        simulateDuck(rubber);
        simulateDuck(decoy);

        decoy.setFlyBehavior(new FlyWithRocket());
        simulateDuck(decoy);

    }

    private static void simulateDuck(Duck duck) {
        duck.swim();
        duck.quack();
        duck.display();
        duck.fly();
        System.out.println("------------------");
    }

}
