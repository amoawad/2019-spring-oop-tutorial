package game;

public class Silent implements Weapon {

    private Weapon weapon;

    public Silent(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public int fire() {
        return weapon.fire();
    }

    @Override
    public void makeNoise() {
        System.out.println("ssssshhhh(");
        weapon.makeNoise();
        System.out.println(")");
    }

}
