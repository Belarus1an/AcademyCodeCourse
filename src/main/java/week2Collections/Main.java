package week2Collections;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] tablica = new int[10];
        tablica[0] = 15;

        List<Integer> listArray  = new ArrayList<Integer>();
        listArray.add(15);

        System.out.println(listArray.get(0));
    }
}
