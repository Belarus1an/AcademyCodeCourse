package week3OOP.person;

import week3OOP.game.Player;

import java.util.List;

public class Person {

    private String name;
    private String surname;
    private int age;
    private Boolean gender;

    public Person(String name, String surname, int age, Boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public static void  getAllPeople(List<Person> personList){

        for (Person value: personList){
            System.out.println(value);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name: " + name +
                ", surname: " + surname + '}';
    }
}
