import java.util.Random;

public class Hero {

    private Game game;

    public Hero(Game game) {
        this.game = game;
    }

    public void walk(int steps) {
        game.moveHero(steps);
    }

    public void fight() {
        Random random = new Random();
        int count = random.nextInt(20);

        game.killEnemies(count);
    }

}
