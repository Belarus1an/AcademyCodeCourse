package week1ZadaniaFor;

import java.util.Scanner;

public class Zadanie10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        //A
        System.out.println("A");
        for (int i = 0; i <= count ; i++) {
            for (int j = 0; j < i; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }

        //B
        System.out.println("B");
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
