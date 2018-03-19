import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoringSequenceTest {

    @Test
    public void shouldCreateSequenceWithOneTurn() {
        ScoringSequence scoringSequence = new ScoringSequence("--");

        assertEquals(1, scoringSequence.turns.size());
    }

}