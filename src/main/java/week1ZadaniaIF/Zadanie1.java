package week1ZadaniaIF;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int a = 5;

        if (number1 >= a){
            System.out.println(number1 + " > " + a);
        } else
        System.out.println(number1 + " < " + a);
    }
}
