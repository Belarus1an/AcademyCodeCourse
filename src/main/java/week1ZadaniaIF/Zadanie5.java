package week1ZadaniaIF;

import java.util.Scanner;

public class Zadanie5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int max = a > b ? a : b;
        System.out.println(max);
    }
}
