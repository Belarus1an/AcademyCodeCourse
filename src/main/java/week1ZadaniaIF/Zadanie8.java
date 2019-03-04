package week1ZadaniaIF;

import java.util.Scanner;

public class Zadanie8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text1 = scanner.next();
        String a = String.valueOf(text1.charAt(0));
        String b = String.valueOf(text1.charAt(text1.length() - 1));

        if (a.equals(b)){
            System.out.println(true);
        } else
            System.out.println(false);


    }
}
