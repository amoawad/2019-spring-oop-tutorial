package warriors;

import aresenals.Arsenal;
import weapons.Weapon;

public class NorthKnight extends Warrior {

    public NorthKnight(Arsenal arsenal) {
        this.arsenal = arsenal;

        this.primaryWeapon = arsenal.getSword();
        this.secondaryWeapon = arsenal.getDagger();
    }

    @Override
    public void putArmor() {
        System.out.println("North Knight puts armor");
    }

    @Override
    public void holdPrimaryWeapon() {
        System.out.println("North Knight holds PW");
    }

    @Override
    public void holdSecondaryWeapon() {
        System.out.println("North Knight holds SW");
    }

    @Override
    public void march() {
        System.out.println("North Knight marches");
    }
}
