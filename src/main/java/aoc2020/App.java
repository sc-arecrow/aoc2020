package aoc2020;

import java.util.List;

public class App {
    private Reader reader;
    private Solver solver;

    public App() {
        this.reader = new Reader();
        this.solver = new Solver();
    }

    public void solve(int day) {
        List<String> input = reader.readInput(day);
        String partOneResult = solver.solve(day, 1, input);
        String partTwoResult = solver.solve(day, 2, input);

        printResult(day, partOneResult, partTwoResult);
    }

    private void printResult(int day, String partOneResult, String partTwoResult) {
        System.out.println(String.format("Day %d: (1) %s (2) %s", day, partOneResult, partTwoResult));
    }
}
