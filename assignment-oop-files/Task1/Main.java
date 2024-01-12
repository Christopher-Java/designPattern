import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> persons;

        Storage.save(AddingStuff.addPerson());

        persons = Storage.fetchPersons();
        System.out.println(persons);
    }
}
