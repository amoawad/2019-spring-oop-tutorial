package warriors;

import aresenals.Arsenal;

public class NorthMagician extends Warrior {

    public NorthMagician(Arsenal arsenal) {
        this.arsenal = arsenal;

        this.primaryWeapon = arsenal.getStaff();
        this.secondaryWeapon = arsenal.getPotion();
    }

    @Override
    public void putArmor() {
        System.out.println("North Magician puts armor");
    }

    @Override
    public void holdPrimaryWeapon() {
        System.out.println("North Magician holds PW");
    }

    @Override
    public void holdSecondaryWeapon() {
        System.out.println("North Magician holds SW");
    }

    @Override
    public void march() {
        System.out.println("North Magician marches");
    }
}
