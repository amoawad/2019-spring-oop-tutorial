public class Game {

    private GameState gameState;

    private GameState checkPoint;

    public Game() {
        this.gameState = new GameState();
        this.gameState.setLevel(1);
        this.gameState.setHeroPosition(0);
        this.gameState.setEnemiesCount(100);
    }

    public void moveHero(int steps) {
        this.gameState.setHeroPosition(gameState.getHeroPosition() + steps);
    }

    public void killEnemies(int count) {
        gameState.setEnemiesCount(gameState.getEnemiesCount() - count);
        if(gameState.getEnemiesCount() <= 0) {
            levelUp();
        }
    }

    private void levelUp() {
        System.out.println("Level up");
        gameState.setLevel(gameState.getLevel() +1);
        gameState.setEnemiesCount(100);
        gameState.setHeroPosition(0);
    }

    public void saveCheckPoint() {
        System.out.println("--- Saving checkpoint ---");
        checkPoint = new GameState();
        checkPoint.setLevel(gameState.getLevel());
        checkPoint.setEnemiesCount(gameState.getEnemiesCount());
        checkPoint.setHeroPosition(gameState.getHeroPosition());
    }

    public void restoreCheckPoint() {
        System.out.println("--- Restoring checkpoint ---");
        gameState = new GameState();
        gameState.setLevel(checkPoint.getLevel());
        gameState.setEnemiesCount(checkPoint.getEnemiesCount());
        gameState.setHeroPosition(checkPoint.getHeroPosition());
    }

    @Override
    public String toString() {
        return gameState.toString();
    }
}
