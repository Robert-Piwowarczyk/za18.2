import java.util.List;

public class FilteringMachineTwo {
    // metoda powinna zwrócić imiona wszystkich niedorosłych osób (mniej niż 18 lat)
    public void findKidNames(List<Person> ppl) {

        Person person = new Person("", 0);

        List<Person> peolple = List.of(new Person("Adam", 10),
                new Person("Tomek", 35), new Person("Ewa", 19),
                new Person("Wojtek", 42), new Person("Ala", 14),
                new Person("Jakub", 29));

        peolple.stream()
                .filter(Person -> person.getAge() < 18)
                .forEach(System.out::println);
    }

    public void convertPeopleToUsers(List<Person> people) {

        people.stream()
                .map(person -> new User(person.getName(), person.getAge(),
                        person.getName()  + "_" + person.getAge()))
                .collect(Collectors.toList());
    }
}
