package week1ZadaniaIF;

import java.util.Scanner;

public class Zadanie16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age1 = scanner.nextInt();
        int age2 = scanner.nextInt();

        if ((age1 >= 13 && age1 <= 18) && (age2 >= 13 && age2 <= 18)){
            System.out.println("TAK");
        } else
            System.out.println("NIE");
    }
}
