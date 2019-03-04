package week2Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            numberList.add(i);
        }

        System.out.println(getDividedByThree(numberList));
    }

    static List<Integer> getDividedByThree(List<Integer> list){

        List<Integer> newArray = new LinkedList<Integer>();

        for (Integer value: list) {
            if (value % 3 == 0){
                newArray.add(value);
            }
        }
        return newArray;
    }
}
