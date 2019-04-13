package warriors;

import aresenals.Arsenal;
import weapons.Weapon;

public abstract class Warrior {

    protected Arsenal arsenal;
    protected Weapon primaryWeapon;
    protected Weapon secondaryWeapon;


    public abstract void putArmor();
    public abstract void holdPrimaryWeapon();
    public abstract void holdSecondaryWeapon();
    public abstract void march();

}
