package week1ZadaniaMetody;

import java.util.Scanner;

public class Zadanie6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        test(num);

    }

    static void test(int num){

        if (num % 2 == 0){
            System.out.println("Liczba jest parzysta");
        } else
            System.out.println("Lizcba nie jest parzysta");
    }
}
