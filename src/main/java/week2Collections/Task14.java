package week2Collections;

import java.util.HashMap;
import java.util.Map;

public class Task14 {

    public static void main(String[] args) {
        String[] arr = new String[]{"Dog" , "Cat", "car", "123", "Horse"};
        System.out.println(wordCount(arr));
    }

    static Map<String, Integer> wordCount(String[] elements){

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < elements.length; i++) {
            map.put(elements[i], i);
        }

        return map;
    }
}
