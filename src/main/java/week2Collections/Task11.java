package week2Collections;

import java.util.LinkedList;
import java.util.List;

public class Task11 {

    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<Integer>();

        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }
        linkedList.set(0, 5);
        linkedList.set(2, 5);

        for (Integer num: linkedList){
            System.out.print(num);
        }
    }
}
