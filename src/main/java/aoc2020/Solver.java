package aoc2020;

import static java.util.Objects.requireNonNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import aoc2020.day01.Day01;

public class Solver {
    private static final Map<Integer, Day> DAYS = initialiseDays();

    private static Map<Integer, Day> initialiseDays() {
        Map<Integer, Day> days = new HashMap<>();
        days.put(1, new Day01());

        return days;
    }

    public String solve(int dayNumber, int part, List<String> input) {
        requireNonNull(input);
        assert part == 1 || part == 2;

        Day day = DAYS.get(dayNumber);

        if (part == 1) {
            return day.partOne(input);
        } else {
            return day.partTwo(input);
        }
    }
}
