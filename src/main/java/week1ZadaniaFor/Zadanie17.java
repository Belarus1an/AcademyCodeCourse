package week1ZadaniaFor;

import java.util.Scanner;

public class Zadanie17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        for (int i = 0; i < name.length(); i += 2) {
            System.out.print(name.charAt(i));
        }
    }
}
