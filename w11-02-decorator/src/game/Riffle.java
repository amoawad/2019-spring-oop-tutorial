package game;

public class Riffle implements Weapon {
    @Override
    public int fire() {
        return 20;
    }

    @Override
    public void makeNoise() {
        System.out.println("ratatataatatatata");
    }
}
