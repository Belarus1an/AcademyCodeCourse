package week1Zadania;

import java.util.Random;

public class Zadanie6 {

    public static void main(String[] args) {

        Random random = new Random();

        int number1 = random.nextInt(50) + 1;
        int number2 = random.nextInt(50) + 1;

        System.out.println(number1);
        System.out.println(number2);

    }
}
