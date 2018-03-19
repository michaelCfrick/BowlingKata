import java.util.ArrayList;
import java.util.List;

public class ScoringSequence {
    private static final int ALL_DOWN_SCORE = 10;
    private static final int NUMBER_OF_TURNS = 10;
    List<Turn> turns = new ArrayList<>();

    ScoringSequence(String sequenceString) {
        for(String turnSequence : sequenceString.split(" ")) {
            Turn turn = new Turn(turnSequence);
            turns.add(turn);
        }
    }

    public int calculate() {
        int sum = 0;

        for(int i = 0; i < turns.size(); i++) {
            if(turns.get(i).spare) {
                Turn nextTurn = turns.get(i+1);
                sum += ALL_DOWN_SCORE + nextTurn.getTryValue(0);
            } else if(turns.get(i).strike && i < NUMBER_OF_TURNS) {
                sum = calculateStrikeScore(sum, i);
            } else {
                sum += turns.get(i).getSum();
            }
        }
        return sum;
    }

    private int calculateStrikeScore(int sum, int i) {
        Turn nextTurn = turns.get(i+1);

        if(nextTurn.strike) {
            sum += ALL_DOWN_SCORE + nextTurn.getTryValue(0);

            Turn secondTurn = turns.get(i+2);
            sum += secondTurn.strike ? ALL_DOWN_SCORE : secondTurn.getTryValue(0);
        } else {
            sum += ALL_DOWN_SCORE + nextTurn.getTryValue(0);
            sum += nextTurn.getTryValue(1);
        }
        return sum;
    }
}
