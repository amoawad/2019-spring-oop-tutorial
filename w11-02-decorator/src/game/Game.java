package game;

public class Game {

    public static void main(String[] args) {

        Hero hero = new Hero();
        Weapon gun = new Gun();

        hero.setWeapon(gun);
        hero.fight();

        Weapon silentGun = new Silent(gun);

        hero.setWeapon(silentGun);
        hero.fight();

        Weapon riffle = new Riffle();
        hero.setWeapon(riffle);
        hero.fight();

        Weapon silentRiffle = new Silent(riffle);
        hero.setWeapon(silentRiffle);
        hero.fight();

        Weapon powerGun = new PowerUp(gun);
        hero.setWeapon(powerGun);
        hero.fight();

        Weapon silentPowerRiffle = new Silent(new PowerUp(riffle));
        hero.setWeapon(silentPowerRiffle);
        hero.fight();

    }

}
