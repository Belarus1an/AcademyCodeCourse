package week1ZadaniaFor;

import java.util.Scanner;

public class Zadanie18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        while (num1 != 0 && num2 != 0){
            if (num1 >= num2){
                num1 %= num2;
            } else
                num2 %= num1;
        }

        if (num1 == 0){
            System.out.println(num2);
        } else
            System.out.println(num1);
    }
}
