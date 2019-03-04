package week1ZadaniaIF;

import java.util.Scanner;

public class Zadanie9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text1 = scanner.next();
        String text2 = scanner.next();

        if (text1.equals(text2)){
            System.out.println(true);
        } else
            System.out.println(false);
    }
}
