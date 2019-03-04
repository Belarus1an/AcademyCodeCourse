package week1ZadaniaIF;

import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text1 = scanner.next();
//        String text2 = "Akademia";

        if (text1.equals("Akademia")){
            System.out.println(true);
        }else
            System.out.println(false);

    }
}
