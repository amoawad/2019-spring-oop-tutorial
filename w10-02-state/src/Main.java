import machine.GumballMachine;

public class Main {

    public static void main(String[] args) {

        GumballMachine gumballMachine = new GumballMachine(10);

        gumballMachine.insertCoin();
        gumballMachine.turnCrank();

        System.out.println("----");

        gumballMachine.insertCoin();
        gumballMachine.turnCrank();

        System.out.println("----");

        gumballMachine.insertCoin();
        gumballMachine.turnCrank();

        System.out.println("----");

        gumballMachine.insertCoin();
        gumballMachine.turnCrank();

        System.out.println("----");


    }

}
