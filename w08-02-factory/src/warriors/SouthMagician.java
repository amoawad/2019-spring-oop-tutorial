package warriors;

import aresenals.Arsenal;

public class SouthMagician extends Warrior {

    public SouthMagician(Arsenal arsenal) {
        this.arsenal = arsenal;

        this.primaryWeapon = arsenal.getStaff();
        this.secondaryWeapon = arsenal.getPotion();
    }

    @Override
    public void putArmor() {
        System.out.println("South Magician puts armor");
    }

    @Override
    public void holdPrimaryWeapon() {
        System.out.println("South Magician holds PW");
    }

    @Override
    public void holdSecondaryWeapon() {
        System.out.println("South Magician holds SW");
    }

    @Override
    public void march() {
        System.out.println("South Magician marches");
    }
}
