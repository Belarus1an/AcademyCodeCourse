package week3OOP.person;

import java.util.ArrayList;
import java.util.List;

public class TestPerson {

    public static void main(String[] args) {

        Person person1 = new Person("Pavel", "Samsonenka", 26, true);
        Person person2 = new Person("Anna", "Samsonenka", 19, false);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);

        Person.getAllPeople(personList);
    }
}
