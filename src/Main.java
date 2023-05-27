import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Double> doubleList = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("One", "Two", "Three", "Four", "Five"));
        ArrayList<Person> personList = new ArrayList<>(Arrays.asList(
                new Person("Alice", 20, true),
                new Person("Bob", 25, false),
                new Person("Charlie", 30, true)
        ));

        GeneralUtils.swap(intList, 0, 2);
        GeneralUtils.swap(doubleList, 1, 3);
        GeneralUtils.swap(stringList, 2, 4);
        GeneralUtils.swap(personList, 0, 1);

        System.out.println("After swap:");
        System.out.println("intList: " + intList);
        System.out.println("doubleList: " + doubleList);
        System.out.println("stringList: " + stringList);
        System.out.println("personList: " + personList);

        GeneralUtils.removeElement(intList, 0);
        GeneralUtils.removeElement(doubleList, 1);
        GeneralUtils.removeElement(stringList, 2);
        GeneralUtils.removeElement(personList, 0);

        System.out.println("\nAfter removal:");
        System.out.println("intList: " + intList);
        System.out.println("doubleList: " + doubleList);
        System.out.println("stringList: " + stringList);
        System.out.println("personList: " + personList);
    }
}
