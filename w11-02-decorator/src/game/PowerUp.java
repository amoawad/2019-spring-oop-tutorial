package game;

public class PowerUp implements Weapon {

    private Weapon weapon;

    public PowerUp(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public int fire() {
        return 2 * weapon.fire();
    }

    @Override
    public void makeNoise() {
        weapon.makeNoise();
    }

}
