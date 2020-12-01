package aoc2020;

import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class Reader {
    public List<String> readInput(int day) {
        String fileName = getDataFileName(day);
        return getLines(fileName);
    }

    private String getDataFileName(int day) {
        String paddedDay = String.valueOf(day);
        if (day < 10) {
            paddedDay = "0" + day;
        }

        return String.format("day%s.txt", paddedDay);
    }

    private List<String> getLines(String fileName) {
        InputStream is = ClassLoader.getSystemResourceAsStream(fileName);
        requireNonNull(is);

        BufferedReader r = new BufferedReader(new InputStreamReader(is));
        return r.lines().collect(toList());
    }
}
