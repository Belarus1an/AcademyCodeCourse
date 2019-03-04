package week1ZadaniaIF;

import java.util.Scanner;

public class Zadanie4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        if (name.endsWith("a") && !name.equals("Barnaba")){
            System.out.println("zenskie");
        } else
            System.out.println("meskie");

    }
}
