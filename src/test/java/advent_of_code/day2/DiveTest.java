package advent_of_code.day2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DiveTest {
    @Test
    @DisplayName("The submarine must be in position 150")
    public void the_position_of_submarine_must_be_150() {
        var listOfPositions = List.of("forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2");

        assertEquals(150, Dive.findFinalPosition(listOfPositions));
    }
}
