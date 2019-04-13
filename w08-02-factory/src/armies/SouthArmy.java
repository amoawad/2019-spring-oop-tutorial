package armies;

import aresenals.Arsenal;
import aresenals.NorthArsenal;
import aresenals.SouthArsenal;
import warriors.*;

public class SouthArmy extends Army {

    private Arsenal arsenal;

    public SouthArmy() {
        arsenal = new SouthArsenal();
    }

    @Override
    protected Warrior selectWarrior(String type) {
        Warrior warrior = null;

        if(type.equals("knight")) {
            warrior = new SouthKnight(arsenal);
        } else if (type.equals("magician")) {
            warrior = new SouthMagician(arsenal);
        }

        return warrior;
    }

}
