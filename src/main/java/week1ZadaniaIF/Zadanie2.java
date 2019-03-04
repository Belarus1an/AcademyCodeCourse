package week1ZadaniaIF;

import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();

        if (number1%3 == 0){
            System.out.println(true);
        }else
            System.out.println(false);

    }
}
