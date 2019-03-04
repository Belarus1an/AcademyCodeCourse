package week1ZadaniaIF;

import java.util.Scanner;

public class Zadanie13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number % 3 == 0 || number % 5 == 0){
            System.out.println(true);
        } else
            System.out.println(false);

    }
}
