package week1ZadaniaFor;

import java.util.Random;

public class Zadanie7 {

    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 1; i <= 6; i++) {
            int  number = random.nextInt(50) + 1;
            System.out.println(number);
        }
    }
}
