package armies;

import aresenals.Arsenal;
import aresenals.NorthArsenal;
import warriors.NorthKnight;
import warriors.NorthMagician;
import warriors.Warrior;

public class NorthArmy extends Army {

    private Arsenal arsenal;

    public NorthArmy() {
        arsenal = new NorthArsenal();
    }

    @Override
    protected Warrior selectWarrior(String type) {
        Warrior warrior = null;

        if(type.equals("knight")) {
            warrior = new NorthKnight(arsenal);
        } else if (type.equals("magician")) {
            warrior = new NorthMagician(arsenal);
        }

        return warrior;
    }

}
