import java.util.HashMap;
import java.util.Map;

public class BowlingGame {
    private static final Map<Character, Integer> hitMap;
    static {
        hitMap = new HashMap<Character, Integer>();
        hitMap.put('-', 0);
        hitMap.put('1', 1);
    }

    public Integer calculateScoreFrom(String sequence) {
        ScoringSequence scoringsequence = new ScoringSequence(sequence);
        return scoringsequence.calculate();
    }
}


