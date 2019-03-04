package week1ZadaniaMetody;

import java.util.Scanner;

public class Zadanie16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String pasel = scanner.next();
        System.out.println(isPesel(pasel));

    }

    static boolean isPesel(String pesel){
        try {
            Integer.parseInt(pesel);
            return true;
            } catch (Exception e){
                return false;
            }
    }
}
