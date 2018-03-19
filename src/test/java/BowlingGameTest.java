import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    @Test
    public void shouldReturnAScoreOfZeroWithAnEmptySequence () {
        BowlingGame bowlingGame = new BowlingGame();

        int finalEvaluation = bowlingGame.calculateScoreFrom("");

        assertEquals(finalEvaluation, 0);
    }

    @Test
    public void shouldReturnAScoreOfZeroWithATwoFailsTurn () {
        BowlingGame bowlingGame = new BowlingGame();

        int finalEvaluation = bowlingGame.calculateScoreFrom("--");

        assertEquals(finalEvaluation, 0);
    }

    @Test
    public void shouldReturnTheCorrectScoreOfASingleNumericTurn1 () {
        BowlingGame bowlingGame = new BowlingGame();

        int finalEvaluation = bowlingGame.calculateScoreFrom("-5");

        assertEquals(finalEvaluation, 5);
    }

    @Test
    public void shouldReturnTheCorrectScoreOfASingleNumericTurn2 () {
        BowlingGame bowlingGame = new BowlingGame();

        int finalEvaluation = bowlingGame.calculateScoreFrom("35");

        assertEquals(finalEvaluation, 8);
    }

    @Test
    public void shouldReturnTheCorrectScoreOfANumericTurn1 () {
        BowlingGame bowlingGame = new BowlingGame();

        int finalEvaluation = bowlingGame.calculateScoreFrom("35 -1 32");

        assertEquals(finalEvaluation, 14);
    }

    @Test
    public void shouldReturnTheCorrectScoreOfANumericTurn2 () {
        BowlingGame bowlingGame = new BowlingGame();

        int finalEvaluation = bowlingGame.calculateScoreFrom("-- -1 --");

        assertEquals(finalEvaluation, 1);
    }

    @Test
    public void shouldReturnTheCorrectScoreOfASpareAndANumericTurn () {
        BowlingGame bowlingGame = new BowlingGame();

        int finalEvaluation = bowlingGame.calculateScoreFrom("-/ 11");

        assertEquals(finalEvaluation, 13);
    }

    @Test
    public void shouldReturnTheCorrectScoreOfAStrikeAndANumericTurn () {
        BowlingGame bowlingGame = new BowlingGame();

        int finalEvaluation = bowlingGame.calculateScoreFrom("X 13");

        assertEquals(finalEvaluation, 18);
    }

    @Test
    public void shouldReturnTheCorrectScoreOfAExample1 () {
        BowlingGame bowlingGame = new BowlingGame();

        int finalEvaluation = bowlingGame.calculateScoreFrom("9- 9- 9- 9- 9- 9- 9- 9- 9- 9-");

        assertEquals(finalEvaluation, 90);
    }

    @Test
    public void shouldReturnTheCorrectScoreOfAExample2 () {
        BowlingGame bowlingGame = new BowlingGame();

        int finalEvaluation = bowlingGame.calculateScoreFrom("X X X X X X X X X X X X");

        assertEquals(finalEvaluation, 300);
    }
}

