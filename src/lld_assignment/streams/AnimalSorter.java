package lld_assignment.streams;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalSorter implements Comparable<AnimalSorter> {
    private String name;

    AnimalSorter(String name) {
        this.name = name;
    }

    public static List<AnimalSorter> sortAnimalsByLengthDescending(List<AnimalSorter> animals) {
        if (animals.size() < 1) {
            return new ArrayList<>();
        }
        return animals.stream().sorted()
                //add your code here
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<AnimalSorter> animals = Arrays.asList(new AnimalSorter("zebra"), new AnimalSorter("lion"), new AnimalSorter("tiger"), new AnimalSorter("elephant"), new AnimalSorter("giraffe"));
        List<AnimalSorter> sortedAnimals = sortAnimalsByLengthDescending(animals);
        System.out.println(sortedAnimals);

        animals = Arrays.asList(new AnimalSorter("cat"), new AnimalSorter("dog"), new AnimalSorter("animal-x"), new AnimalSorter("elephant"), new AnimalSorter("mouse"));
        sortedAnimals = sortAnimalsByLengthDescending(animals);
        System.out.println(sortedAnimals);

        animals = Arrays.asList();
        sortedAnimals = sortAnimalsByLengthDescending(animals);
        System.out.println(sortedAnimals);

        animals = Arrays.asList(new AnimalSorter("a"), new AnimalSorter("b"), new AnimalSorter("d"), new AnimalSorter("c"), new AnimalSorter("a"));
        sortedAnimals = sortAnimalsByLengthDescending(animals);
        System.out.println(sortedAnimals);
    }

    @Override
    public int compareTo(AnimalSorter o) {
        if (this.name.length() < o.name.length()) {
            return 1;
        } else if (this.name.length() > o.name.length()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "AnimalSorter{" +
                "name='" + name + '\'' +
                '}';
    }
}