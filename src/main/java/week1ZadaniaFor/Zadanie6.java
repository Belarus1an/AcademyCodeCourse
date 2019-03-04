package week1ZadaniaFor;

import java.util.Scanner;

public class Zadanie6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 600;
        int userNumber;

        do {

            userNumber = scanner.nextInt();

            if (userNumber < number){
                System.out.println("Number < 600");
            } else if (userNumber > number){
                System.out.println("Number > 600");
            } else
                System.out.println("Win!");

        } while (userNumber != number);



    }
}
