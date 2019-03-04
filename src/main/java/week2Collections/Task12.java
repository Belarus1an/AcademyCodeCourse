package week2Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task12 {

    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<Integer>();

        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }

        System.out.println(linkedList);
        System.out.println(conversionList(linkedList));

    }

    static List<Integer> conversionList(List<Integer> list){

        List<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++) {
            arrayList.add(list.get(i));
        }

        return arrayList;
    }
}
