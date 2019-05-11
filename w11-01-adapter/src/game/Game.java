package game;

public class Game {

    public static void main(String[] args) {

        Hero hero = new Hero();

        Weapon weapon = new Gun();
        hero.setWeapon(weapon);

        hero.fight();

        AlienGun alienGun = new AlienGun();
        AlienGunAdapter alienGunAdapter = new AlienGunAdapter(alienGun);
        hero.setWeapon(alienGunAdapter);

        hero.fight();

    }

}
