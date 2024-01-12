import java.util.LinkedList;
import java.util.List;

public class AddingStuff {
    public static List<Person> addPerson() {
        LinkedList<Person> persons = new LinkedList<>();

        persons.add(new Person("Bob", "bob@email.com"));
        persons.add(new Person("Ben", "ben@email.com"));
        persons.add(new Person("Pam", "pam@email.com"));
        persons.add(new Person("Eve", "eve@email.com"));
        persons.add(new Person("Guy", "guy@email.com"));
        persons.add(new Person("Lis", "lis@email.com"));
        persons.add(new Person("Ann", "ann@email.com"));

        return persons;
    }
}
