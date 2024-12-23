package lld_assignment.streams;

import java.util.Arrays;
import java.util.List;

public class AllMatchParallelStream {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // What does the following code snippet do?
        boolean allMatch = words.parallelStream()
                .allMatch(w -> w.length() > 3);

        System.out.println("All match: " + allMatch);
    }
}