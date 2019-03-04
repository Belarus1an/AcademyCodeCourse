package week2Collections;

import java.util.ArrayList;
import java.util.List;

public class Task9 {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < 40; i++) {
            arrayList.add(i);
        }

        System.out.println(getMax(arrayList));
    }

    static int getMax(List<Integer> list){

        int max = 0;

        for (int num: list){
            if (num > max){
               max = list.get(num);
            }
        }

        return max;
    }
}
