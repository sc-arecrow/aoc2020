package aoc2020.day01;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import aoc2020.Reader;

public class Day01Test {
    private static final String PART_ONE_RESULT = "996996";
    private static final String PART_TWO_RESULT = "9210402";

    @Test
    public void testPartOne() {
        List<String> input = new Reader().readInput(1);

        String result = new Day01().partOne(input);

        assertEquals(result, PART_ONE_RESULT);
    }

    @Test
    public void testPartTwo() {
        List<String> input = new Reader().readInput(1);

        String result = new Day01().partTwo(input);

        assertEquals(result, PART_TWO_RESULT);
    }
}
