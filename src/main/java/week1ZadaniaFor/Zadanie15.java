package week1ZadaniaFor;

import java.util.Scanner;

public class Zadanie15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i));
        }

        System.out.println();

        for (int j = word.length() - 1; j >= 0; j--) {
//            System.out.println(j);
            System.out.print(word.charAt(j));
        }
    }
}
