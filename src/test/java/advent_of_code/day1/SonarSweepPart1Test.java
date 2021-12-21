package advent_of_code.day1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SonarSweepPart1Test {
    @Test
    @DisplayName("The count of depth increases must be 7, when the floor of the sea is uneven")
    public void count_of_depth_increases_must_be_7() {
        var listOfDepth = List.of(199, 200, 208, 210, 200, 207, 240, 269, 260, 263);
        var numberOfDepth = SonarSweep.count_of_depth_increases_part1(listOfDepth);

        assertEquals(7, numberOfDepth);
    }

    @Test
    @DisplayName("There should be no increases, when the floor of the sea is level")
    public void count_of_depth_increases_must_be_0_when_floor_is_level() {
        var listOfDepth = List.of(199, 199, 199, 199, 199);
        var numberOfDepth = SonarSweep.count_of_depth_increases_part1(listOfDepth);

        assertEquals(0, numberOfDepth);
    }

    @Test
    @DisplayName("There should be no increases, when the floor of  the sea is inclining")
    public void count_of_depth_increases_must_be_0_when_floor_go_up() {
        var listOfDepth = List.of(199, 198, 197, 180, 170);
        var numberOfDepth = SonarSweep.count_of_depth_increases_part1(listOfDepth);

        assertEquals(0, numberOfDepth);
    }

    @Test
    @DisplayName("The count of depth increases must be 4, when the floor of  the sea is declining")
    public void count_of_depth_increases_must_be_0_when_floor_go_down() {
        var listOfDepth = List.of(199, 200, 240, 260, 300);
        var numberOfDepth = SonarSweep.count_of_depth_increases_part1(listOfDepth);

        assertEquals(4, numberOfDepth);
    }
}
