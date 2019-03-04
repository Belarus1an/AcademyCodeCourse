package week1ZadaniaFor;

import java.util.Scanner;

public class Zadanie11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}
