package game;

public class Hero {

    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void fight() {
        this.weapon.makeNoise();
        int damage = this.weapon.fire();
        System.out.println("Damage: " + damage);
        System.out.println("----------");
    }

}
