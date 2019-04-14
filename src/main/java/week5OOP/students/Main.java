package week5OOP.students;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Class c = new Class();

        c.displayStudents();

        c.addStudent("Pavel");
        c.addStudent("Anna");
        c.addStudent("Maria");

        c.displayStudents();

        int a = c.getGirlsCount();
        System.out.println(a);

        float b = c.getAverange();
        System.out.println(b);


    }

}
