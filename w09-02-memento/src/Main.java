public class Main {

    public static void main(String[] args) {

        Game game = new Game();
        Hero hero = new Hero(game);

        hero.walk(10);
        hero.fight();
        hero.fight();
        System.out.println(game);

        hero.walk(5);
        hero.fight();
        System.out.println(game);

        game.saveCheckPoint();

        hero.walk(16);
        hero.fight();
        hero.fight();
        System.out.println(game);

        hero.fight();
        hero.fight();
        hero.fight();
        System.out.println(game);
        hero.fight();
        hero.fight();
        hero.fight();
        hero.fight();
        System.out.println(game);

        hero.walk(6);
        hero.walk(9);
        hero.fight();
        hero.fight();
        hero.fight();
        hero.fight();
        hero.fight();
        hero.fight();
        hero.fight();
        System.out.println(game);

        hero.fight();
        hero.fight();
        hero.fight();
        System.out.println(game);

        game.restoreCheckPoint();
        System.out.println(game);
    }

}
