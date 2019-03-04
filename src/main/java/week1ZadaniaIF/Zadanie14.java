package week1ZadaniaIF;

import java.util.Scanner;

public class Zadanie14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if (age >= 18){
            System.out.println(true);
        } else
            System.out.println(false);
    }
}
