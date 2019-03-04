package week2Collections;

import java.util.LinkedList;
import java.util.List;

public class Task10 {

    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<Integer>();

        for (int i = 0; i < 5; i++) {
            linkedList.add(i);
        }

        for (Integer num: linkedList){
            System.out.print(num);
        }

        linkedList.add(2, 5);
        System.out.println();

        for (Integer num: linkedList){
            System.out.print(num);
        }
    }
}
