package lld_assignment.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AddListToSet {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // What does the following code snippet do?
        Set<String> uniqueFruits = fruits.stream()
                .collect(Collectors.toSet());

        System.out.println("Result: " + uniqueFruits);
    }
}