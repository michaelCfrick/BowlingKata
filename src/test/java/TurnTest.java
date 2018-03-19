import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurnTest {

    @Test
    public void shouldCreateTurnWithTwoTries() {
        Turn turn = new Turn("--");
        assertEquals(2, turn.tries.size());
    }
}