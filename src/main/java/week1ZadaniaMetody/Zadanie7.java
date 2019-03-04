package week1ZadaniaMetody;

import java.util.Scanner;

public class Zadanie7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(sum(num));

    }

    static int sum(int num){

        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}
