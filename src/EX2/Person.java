package EX2;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private boolean married;

    public Person() {
    }

    public Person(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    @Override
    public String toString() {
        return  name + ", " + age + ", " + married;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }


    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    // Comparator by Age
    public static class AgeComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return Integer.compare(p1.getAge(), p2.getAge());
        }
    }

    // Comparator by Married status
    public static class MarriedComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return Boolean.compare(p1.isMarried(), p2.isMarried());
        }
    }
}