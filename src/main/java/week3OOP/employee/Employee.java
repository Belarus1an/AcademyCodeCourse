package week3OOP.employee;

import java.util.List;

public class Employee {

    private String name;
    private String surname;
    private int age;
    private int experience;
    private int salary;

    public Employee(String name, String suname, int age, int experience) {
        this.name = name;
        this.surname = suname;
        this.age = age;
        this.experience = experience;
    }

    public Employee(String name, String surname, int age, int experience, int salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.experience = experience;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public static void showInfo(List<Employee> employeeList){

        for (Employee value: employeeList){
            System.out.println(value.getName() + " " + value.getSurname()
                    + " " + value.getAge() + " " + value.getExperience() + " " + value.getSalary());
        }
    }

    public static void sumSalary(List<Employee> employeeList){

        int sumSalary = 0;
        for (Employee value: employeeList){
            sumSalary += value.getSalary();
        }
        System.out.println(sumSalary);
    }
}
