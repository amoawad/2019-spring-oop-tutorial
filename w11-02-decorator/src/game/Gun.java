package game;

public class Gun implements Weapon {
    @Override
    public int fire() {
        return 10;
    }

    @Override
    public void makeNoise() {
        System.out.println("pew");
    }
}
