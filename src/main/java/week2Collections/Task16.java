package week2Collections;

import java.util.HashMap;
import java.util.Map;

public class Task16 {

    public static void main(String[] args) {

        String[] strings = new String[]{"code", "bug"};
        System.out.println(pairs(strings));

    }

   static Map<String, String> pairs(String[] strings) {

       Map<String, String> map = new HashMap<>();

       for (String ch : strings) {
           map.put(String.valueOf(ch.charAt(0)), String.valueOf(ch.charAt(ch.length() - 1)));
       }
       return map;
   }
}
