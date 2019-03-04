package week1ZadaniaFor;

import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.reverse();

        if (word.equals(stringBuilder.toString())){
            System.out.println("Tak!");
        } else
            System.out.println("Nie!");

    }
}
