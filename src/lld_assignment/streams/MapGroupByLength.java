package lld_assignment.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapGroupByLength {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // What does the following code snippet do?
        java.util.Map<Integer, List<String>> groupedByLength = fruits.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("Result: " + groupedByLength);
    }
}