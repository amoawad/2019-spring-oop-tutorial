package game;

public class AlienGunAdapter implements Weapon {

    private AlienGun alienGun;

    public AlienGunAdapter(AlienGun alienGun) {
        this.alienGun = alienGun;
    }

    @Override
    public void fire() {
        this.alienGun.cutWithLaser();
    }

}
