package machine;

import org.omg.CORBA.PUBLIC_MEMBER;
import states.*;

public class GumballMachine {

    private final State NO_COIN;
    private final State HAS_COIN;
    private final State SOLD;
    private final State WINNER;
    private final State OUT_OF_GUMBALLS;

    private State STATE;

    private int gumballs;

    public GumballMachine(int num) {
        this.gumballs = num;

        NO_COIN = new NoCoinState(this);
        HAS_COIN = new HasCoinState(this);
        SOLD = new GumballSoldState(this);
        WINNER = new WinnerState(this);
        OUT_OF_GUMBALLS = new OutOfGumballsState(this);

        STATE = NO_COIN;
    }

    public void insertCoin() {
        STATE.insertCoin();
    }

    public void ejectCoin() {
        STATE.ejectCoin();
    }

    public void turnCrank() {
        STATE.turnCrank();
        STATE.dispense();
    }

    public void release(int num) {
        System.out.println("Releasing: " + num + " gumball");
        gumballs -= num;
    }

    public int getGumballs() {
        return gumballs;
    }

    public void changeState(State state) {
        this.STATE = state;
    }

    public State getNO_COIN() {
        return NO_COIN;
    }

    public State getHAS_COIN() {
        return HAS_COIN;
    }

    public State getSOLD() {
        return SOLD;
    }

    public State getWINNER() {
        return WINNER;
    }

    public State getOUT_OF_GUMBALLS() {
        return OUT_OF_GUMBALLS;
    }
}
