package week3OOP.person;

import java.util.ArrayList;
import java.util.List;

public class TestPerson {

    public static void main(String[] args) {

        Person person1 = new Person("Bob", "Bobik", 26, true);
        Person person2 = new Person("Tom", "Tomik", 19, false);
        Person person3 = new Person("Jan", "Janik", 19, true);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        Person.getAllPeople(personList);
    }
}
