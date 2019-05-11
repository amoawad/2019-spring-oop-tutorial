package game;

public class Hero {

    Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void fight() {
        weapon.fire();
    }

}
