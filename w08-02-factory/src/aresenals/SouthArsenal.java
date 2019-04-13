package aresenals;

import weapons.*;

public class SouthArsenal implements Arsenal {
    @Override
    public Weapon getSword() {
        return new IndianSword();
    }

    @Override
    public Weapon getDagger() {
        return new ArabianSpear();
    }

    @Override
    public Weapon getStaff() {
        return new DarkStaff();
    }

    @Override
    public Weapon getPotion() {
        return new ManaPotion();
    }
}
