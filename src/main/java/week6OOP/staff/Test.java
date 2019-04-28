package week6OOP.staff;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Staff person1 = new Worker("Pavel", 2500);
        Staff person2 = new Worker("Rafal", 2500);
        Staff person3 = new Worker("Bob", 2200);
        Staff person4 = new Maneger("Anna", 3500);
        Staff person5 = new Maneger("Oksana", 4500);
        Staff person6 = new Derector("Sid", 6000);


        List<Staff> staff = new ArrayList<>();
        staff.add(person1);
        staff.add(person2);
        staff.add(person3);
        staff.add(person4);
        staff.add(person5);
        staff.add(person6);

        for (Staff value: staff){
            value.getInfo();
        }
    }
}
