package week2Collections;

import java.util.HashMap;
import java.util.Map;

public class Task15 {

    public static void main(String[] args) {

        String[] words = new String[]{"Pan", "Sol", "Mleko", "Sok", "Miod", "Pavel"};

        System.out.println(firstChar(words));

    }

    static Map<String, String> firstChar(String[] words){

        Map<String, String> map = new HashMap<>();

        String word1, word2;

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < i; j++) {
                if (words[i].charAt(0) == words[j].charAt(0)){
                    word1 = words[i];
                    word2 = words[j];
                    map.put(String.valueOf(words[i].charAt(0)), word1 + word2);
                }
            }
        }
        return map;
    }
}
