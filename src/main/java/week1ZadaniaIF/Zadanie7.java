package week1ZadaniaIF;

import java.util.Scanner;

public class Zadanie7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text1 = scanner.next();

        if (text1.endsWith("M") || text1.endsWith("m")){
            System.out.println("TAK");
        } else
            System.out.println("NIE");

//        int index = text1.length() - 1;
//
//        if (text1.charAt(index) == 'm' || text1.charAt(index) == 'M'){
//            System.out.println(true);
//        } else
//            System.out.println(false);
    }
}
