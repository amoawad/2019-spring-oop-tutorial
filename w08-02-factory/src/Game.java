import armies.Army;
import armies.NorthArmy;
import armies.SouthArmy;
import warriors.Warrior;

public class Game {

    public static void main(String[] args) {

        Army northArmy = new NorthArmy();
        Army southArmy = new SouthArmy();

        Warrior northKnight = northArmy.createWarrior("knight");
        Warrior northMagician = northArmy.createWarrior("magician");

        Warrior southKnight = southArmy.createWarrior("knight");
        Warrior southMagician = southArmy.createWarrior("magician");

    }

}
