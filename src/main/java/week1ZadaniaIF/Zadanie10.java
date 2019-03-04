package week1ZadaniaIF;

import java.util.Scanner;

public class Zadanie10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String www = "www.wp.pl";
        String text = scanner.next();

        if (text.equals(www)){
            System.out.println(true);
        } else
            System.out.println(false);
    }
}
