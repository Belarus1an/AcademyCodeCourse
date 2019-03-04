package week2Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task6_7 {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        String color = scanner.next();

        arrayList.add("Red");
        arrayList.add("Green");
        arrayList.add("White");
        arrayList.add("Blue");

//        for (String colors: arrayList){
//            System.out.println(colors);
//        }

        System.out.println("-----------------");
        System.out.println(findIndexColor(color, arrayList));
    }

    static int findIndexColor(String color, List<String> listColors){

        for (String colors: listColors){
            if (colors.equals(color)){
                return listColors.indexOf(color);
            }
        }
        return -1;
    }
}
