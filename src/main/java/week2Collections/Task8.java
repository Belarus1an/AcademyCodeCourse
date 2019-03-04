package week2Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task8 {

    public static void main(String[] args) {

        List<Integer> listArray = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            listArray.add(i);
        }

        System.out.println(listArray);
        System.out.println(listReverse(listArray));

    }

    static List<Integer> listReverse(List<Integer> arrayList){

        Collections.reverse(arrayList);
        return arrayList;
    }
}
