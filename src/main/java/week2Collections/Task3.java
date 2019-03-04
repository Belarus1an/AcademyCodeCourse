package week2Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = 0;

        List<Integer> listNum = new ArrayList<Integer>();

        listNum.add(1);
        listNum.add(1);
        listNum.add(3);
        listNum.add(3);
        listNum.add(1);
        listNum.add(5);

        for(Integer value: listNum){
            if (value == num){
                a++;
            }
        }

        System.out.println("wystepue " + a + " razy");

    }


}
