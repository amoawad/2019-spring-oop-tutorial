import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {

    @Test
    public void testRollOne_scoreShouldBeOne() {
        BowlingGame game = new BowlingGame();
        game.roll(1);
        assertEquals(1, game.calcScore());
    }

    @Test
    public void testRollMany_scoreShouldAccumulate() {
        BowlingGame game = new BowlingGame();
        game.roll(2);
        game.roll(4);
        game.roll(3);
        game.roll(1);
        game.roll(5);
        assertEquals(15, game.calcScore());
    }

    @Test
    public void testSpare_scoreShouldAccountForNextBall() {
        BowlingGame game = new BowlingGame();
        game.roll(4);
        game.roll(6);
        game.roll(4);
        assertEquals(18, game.calcScore());
    }

    @Test
    public void testFakeSpare() {
        BowlingGame game = new BowlingGame();
        game.roll(3);
        game.roll(5);
        game.roll(5);
        game.roll(2);
        assertEquals(15, game.calcScore());
    }

    @Test
    public void testStrike() {
        BowlingGame game = new BowlingGame();
        game.roll(10);
        game.roll(3);
        game.roll(2);
        assertEquals(20, game.calcScore());
    }

    @Test
    public void testStrike_0_10() {
        BowlingGame game = new BowlingGame();
        game.roll(0);
        game.roll(10);
        game.roll(3);
        game.roll(2);
        assertEquals(18, game.calcScore());
    }

    @Test
    public void testPerfectGame() {
        BowlingGame game = new BowlingGame();
        for(int i = 0; i < 12; i++) {
            game.roll(10);
        }
        assertEquals(300, game.calcScore());
    }

}
