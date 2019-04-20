public class GameState {

    private int level;
    private int heroPosition;
    private int enemiesCount;

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHeroPosition(int heroPosition) {
        this.heroPosition = heroPosition;
    }

    public void setEnemiesCount(int enemiesCount) {
        this.enemiesCount = enemiesCount;
    }

    public int getLevel() {
        return level;
    }

    public int getHeroPosition() {
        return heroPosition;
    }

    public int getEnemiesCount() {
        return enemiesCount;
    }

    @Override
    public String toString() {
        return "Currernt position: " + heroPosition + ", Level: " + level + ", Remaining Enemies: " + enemiesCount;
    }
}
