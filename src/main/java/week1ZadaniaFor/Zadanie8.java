package week1ZadaniaFor;

import java.util.Scanner;

public class Zadanie8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password = "Polska";
        String userPassword;
        boolean passwordStatus = false;

        do {

            userPassword = scanner.next();
            if (!userPassword.equals(password)){
                System.out.println("Podaj poprawne hasło!");
            } else {
                System.out.println("Haslo jest poprawne");
                passwordStatus = true;
            }

        } while (!passwordStatus);
    }
}
