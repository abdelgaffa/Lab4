package EX2;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Bob", 30, true),
                new Person("Alice", 25, false),
                new Person("Charlie", 35, true),
                new Person("Dave", 20, false)
        };

        // sort by name
        Arrays.sort(people);
        System.out.println("Sorted by name: " + Arrays.toString(people));

        // find max by name
        Person maxByName = findMax(people);
        System.out.println("Max by name: " + maxByName);

        // sort by age
        Arrays.sort(people, new Person.AgeComparator());
        System.out.println("Sorted by age: " + Arrays.toString(people));

        // find max by age
        Person maxByAge = findMax(people, new Person.AgeComparator());
        System.out.println("Max by age: " + maxByAge);

        // sort by married status
        Arrays.sort(people, new Person.MarriedComparator());
        System.out.println("Sorted by married status: " + Arrays.toString(people));

        // find max by married status
        Person maxByMarriedStatus = findMax(people, new Person.MarriedComparator());
        System.out.println("Max by married status: " + maxByMarriedStatus);
    }

    public static <T extends Comparable<T>> T findMax(T[] array) {
        return Arrays.stream(array).max(T::compareTo).orElse(null);
    }

    public static <T> T findMax(T[] array, Comparator<? super T> comparator) {
        return Arrays.stream(array).max(comparator).orElse(null);
    }
}
