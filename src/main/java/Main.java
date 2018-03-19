public class Main {

    public static void main(String[] args) {
        String bowlingGameTurns = "26 36 -- -3 X 5/ 81 X 21 9-";

        BowlingGame bowlingGame = new BowlingGame();
        int score = bowlingGame.calculateScoreFrom(bowlingGameTurns);

        System.out.println("SCORE: " + score);
    }
}
