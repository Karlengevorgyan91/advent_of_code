package advent_of_code.utilTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import advent_of_code.util.Util;

public class UtilTest {
    @Test
    @DisplayName("Sliding over [1, 2, 3, 4] with a step of 3 should return [[1, 2, 3], [2, 3, 4]]")
    public void sliding_with_step_3_must_return_list_of_list_size_2() {
        var expected = List.of(List.of(1, 2, 3), List.of(2, 3, 4)).toArray();
        var actual = Util.sliding(List.of(1, 2, 3, 4), 3).toArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Sliding over [1, 2, 3, 4] with a step of 2 should return [[1, 2], [2, 3], [3, 4]]")
    public void sliding_with_step_2_must_return_list_of_list_size_3() {
        var expected = List.of(List.of(1, 2), List.of(2, 3), List.of(3, 4)).toArray();
        var actual = Util.sliding(List.of(1, 2, 3, 4), 2).toArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Sliding over [1, 2, 3, 4] with a step of 1 should return [[1], [2], [3], [4]]")
    public void sliding_with_step_1_must_return_list_of_list_size_4() {
        var expected = List.of(List.of(1), List.of(2), List.of(3), List.of(4)).toArray();
        var actual = Util.sliding(List.of(1, 2, 3, 4), 1).toArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Sliding over [] with a step of 1 should return []")
    public void sliding_with_step_1_on_empty_list_must_return_list_of_size_0() {
        var expected = List.of().toArray();
        var actual = Util.sliding(List.of(), 1).toArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Sliding over [] with a step of 20 should return []")
    public void sliding_with_step_20_on_empty_list_must_return_list_of_size_0() {
        var expected = List.of().toArray();
        var actual = Util.sliding(List.of(), 20).toArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Sliding over [1, 2, 3] with a step of 4 should return []")
    public void sliding_with_step_20_must_return_list_of_size_0() {
        var expected = List.of().toArray();
        var actual = Util.sliding(List.of(1, 2, 3), 4).toArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Sliding over [1, 2] with a step of 4 should return []")
    public void sliding_with_step_4_must_return_list_of_size_0() {
        var expected = List.of().toArray();
        var actual = Util.sliding(List.of(1, 2), 4).toArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Sliding over [1, 2, 3] with a step of 3 should return [[1, 2, 3]]")
    public void sliding_with_step_3_must_return_list_of_list_size_1() {
        var expected = List.of(List.of(1, 2, 3)).toArray();
        var actual = Util.sliding(List.of(1, 2, 3), 3).toArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Sliding over [1, 2] with a step of 2 should return [[1, 2]]")
    public void sliding_with_step_2_must_return_list_of_list_size_1() {
        var expected = List.of(List.of(1, 2)).toArray();
        var actual = Util.sliding(List.of(1, 2), 2).toArray();

        assertArrayEquals(expected, actual);
    }
}
