package week1ZadaniaMetody;

import java.util.Scanner;

public class Zadanie8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(test(num));

    }

    static boolean test(int num){

        if ((num * num) % 2 == 0){
            return true;
        }
        return false;
    }
}
