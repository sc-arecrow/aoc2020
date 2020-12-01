package aoc2020.day01;

import static java.util.stream.Collectors.toList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import aoc2020.Day;

public class Day01 implements Day {
    private static final Integer TOTAL_SUM_OF_ENTRIES = 2020;

    @Override
    public String partOne(List<String> input) {
        List<Integer> entries = getEntries(input);
        Set<Integer> checkedEntries = new HashSet<>();

        for (int firstEntry : entries) {
            int secondEntry = TOTAL_SUM_OF_ENTRIES - firstEntry;
            if (checkedEntries.contains(secondEntry)) {
                int result = firstEntry * secondEntry;
                return String.valueOf(result);
            }

            checkedEntries.add(firstEntry);
        }

        return "";
    }

    @Override
    public String partTwo(List<String> input) {
        List<Integer> entries = getEntries(input);

        for (int i = 0; i < entries.size(); i++) {
            int firstEntry = entries.get(i);
            int sumOfRemainingEntries = TOTAL_SUM_OF_ENTRIES - firstEntry;
            Set<Integer> checkedEntries = new HashSet<>();

            for (int j = i + 1; j < entries.size(); j++) {
                int secondEntry = entries.get(j);
                int thirdEntry = sumOfRemainingEntries - secondEntry;
                if (checkedEntries.contains(thirdEntry)) {
                    int result = firstEntry * secondEntry * thirdEntry;
                    return String.valueOf(result);
                }

                checkedEntries.add(secondEntry);
            }
        }

        return "";
    }

    private List<Integer> getEntries(List<String> input) {
        return input.stream().map(Integer::parseInt).collect(toList());
    }
}
