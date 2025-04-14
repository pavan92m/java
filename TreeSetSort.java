import java.util.*;

public class TreeSetSort {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Alice", 30, 65.5),
                new Person("Bob", 25, 75.0),
                new Person("Alice", 30, 65.5),
                new Person("Alice", 30, 65.5),
                new Person("Charlie", 35, 80.0)
        ));
        Comparator<Person> personComparator = Comparator
                .comparing(Person::getName)
                .thenComparing(Person::getAge)
                .thenComparing(Person::getWeight);
        Set<Person> personSet = new TreeSet<>(personComparator);
        personSet.addAll(people);
        System.out.println(personSet);
    }
}
