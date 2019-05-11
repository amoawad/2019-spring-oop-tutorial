package ducks;

public class Main {

    public static void main(String[] args) {

        Duck duck = new MallardDuck();

        Turkey turkey = new Turkey();
        TurkeyToDuckAdapter turkeyToDuckAdapter = new TurkeyToDuckAdapter(turkey);

        simulateDuck(duck);
        simulateDuck(turkeyToDuckAdapter);

    }

    private static void simulateDuck(Duck duck) {
        duck.quack();
        duck.fly();
        System.out.println("--------");
    }

}
