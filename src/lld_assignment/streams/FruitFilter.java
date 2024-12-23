package lld_assignment.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FruitFilter {

    public static List<String> filterFruitsStartingWithA(List<String> fruits) {
        List<String> abc = fruits.stream().filter(x->x.charAt(0)=='A').collect(Collectors.toList());
        return abc;
    }

    public static void main(String[] args) {
        List<String> allFruits = Arrays.asList("Apple", "Banana", "Apricot", "Avocado", "Orange");
        List<String> fruitsStartingWithA = filterFruitsStartingWithA(allFruits);
        System.out.println("Fruits starting with 'A': " + fruitsStartingWithA);

        allFruits = Arrays.asList("Grapes", "Almond", "DragonFruit");
        fruitsStartingWithA = filterFruitsStartingWithA(allFruits);
        System.out.println("Fruits starting with 'A': " + fruitsStartingWithA);

        allFruits = Arrays.asList("Grapes","DragonFruit");
        fruitsStartingWithA = filterFruitsStartingWithA(allFruits);
        System.out.println("Fruits starting with 'A': " + fruitsStartingWithA);
    }
}