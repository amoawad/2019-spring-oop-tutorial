public class BowlingGame {

    int[] rolls;
    int index;

    public BowlingGame() {
        rolls = new int[21];
        index = 0;
    }

    public void roll(int pins) {
        this.rolls[index++] = pins;
    }

    public int calcScore() {
        int result = 0;

        int indexOfBallInsideFrame = 0;

        for(int frame = 0; frame < 10; frame++) {
            if(frameIsStrike(rolls[indexOfBallInsideFrame])) { // strike
                result += 10 + rolls[indexOfBallInsideFrame+1] + rolls[indexOfBallInsideFrame+2];
                indexOfBallInsideFrame += 1;
            } else if(frameIsSpare(indexOfBallInsideFrame)) { // spare
                result += 10 + rolls[indexOfBallInsideFrame+2];
                indexOfBallInsideFrame += 2;
            } else {
                result += rolls[indexOfBallInsideFrame] + rolls[indexOfBallInsideFrame+1];
                indexOfBallInsideFrame += 2;
            }
        }

        return result;
    }

    private boolean frameIsSpare(int indexOfBallInsideFrame) {
        return rolls[indexOfBallInsideFrame] + rolls[indexOfBallInsideFrame+1] == 10;
    }

    private boolean frameIsStrike(int roll) {
        return roll == 10;
    }
}
