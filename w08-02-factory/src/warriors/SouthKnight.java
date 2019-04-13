package warriors;

import aresenals.Arsenal;

public class SouthKnight extends Warrior {

    public SouthKnight(Arsenal arsenal) {
        this.arsenal = arsenal;

        this.primaryWeapon = arsenal.getSword();
        this.secondaryWeapon = arsenal.getDagger();
    }

    @Override
    public void putArmor() {
        System.out.println("South Knight puts armor");
    }

    @Override
    public void holdPrimaryWeapon() {
        System.out.println("South Knight holds PW");
    }

    @Override
    public void holdSecondaryWeapon() {
        System.out.println("South Knight holds SW");
    }

    @Override
    public void march() {
        System.out.println("South Knight marches");
    }
}
