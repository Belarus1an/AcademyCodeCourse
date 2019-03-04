package week1ZadaniaIF;

import java.util.Scanner;

public class Zadanie6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int min = a < b ? a : b;
        min = c < min ? c : min;
        System.out.println(min);


//        if (a < b & a < c){
//            System.out.println(a);
//        } else
//            if (b < a & b < c){
//                System.out.println(b);
//            } else
//                System.out.println(c);
}}
