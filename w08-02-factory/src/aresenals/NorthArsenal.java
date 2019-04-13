package aresenals;

import weapons.*;

public class NorthArsenal implements Arsenal {
    @Override
    public Weapon getSword() {
        return new ClaymoreSword();
    }

    @Override
    public Weapon getDagger() {
        return new PersianDagger();
    }

    @Override
    public Weapon getStaff() {
        return new LightStaff();
    }

    @Override
    public Weapon getPotion() {
        return new HealthPotion();
    }
}
