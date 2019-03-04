package week1Zadania;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b;
        float c;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = (a + b) / 2;

        System.out.println(c);
    }
}
