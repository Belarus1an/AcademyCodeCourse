package week1ZadaniaIF;

import java.util.Scanner;

public class Zadanie12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String code = scanner.next();

        if (code.length() == 6
                    && code.charAt(2) == '-'
                        && Character.isDigit(code.charAt(0))
                        && Character.isDigit(code.charAt(1))
                        && Character.isDigit(code.charAt(3))
                        && Character.isDigit(code.charAt(4))
                        && Character.isDigit(code.charAt(5))){
            System.out.println(true);
        } else
            System.out.println(false);
    }
}
