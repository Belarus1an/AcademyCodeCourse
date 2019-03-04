package week2Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        List<Integer> firstArray = new ArrayList<Integer>();

        firstArray.add(10);
        firstArray.add(5);
        firstArray.add(8);
        firstArray.add(2);
        firstArray.add(1);

        System.out.println(firstArray);
        System.out.println(getSortedList(firstArray));
    }

    static List<Integer> getSortedList (List<Integer> firstArray){

         Collections.sort(firstArray);
         return firstArray;
    }
}
