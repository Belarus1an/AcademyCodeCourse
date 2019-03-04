package week2Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Map<String, String> mapa = new HashMap<String, String>();
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        mapa.put("Mama", "Mother");


            if (mapa.containsKey(string)) {              //проверка ключей
                System.out.println(mapa.get(string));
                System.out.println("Tak");
            } else{
                System.out.println("Nie ma");
            }

}}
