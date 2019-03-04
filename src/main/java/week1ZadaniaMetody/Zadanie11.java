package week1ZadaniaMetody;

import java.util.Scanner;

public class Zadanie11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        testM(num);

    }

    static void testM(int num){

        for (int i = num; i > 0 ; i--) {
            if (num % i == 0){
                System.out.println(i);
            }

        }
    }
}
