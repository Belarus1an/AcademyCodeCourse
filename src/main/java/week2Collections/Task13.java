package week2Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task13 {

    public static void main(String[] args) {

        List<String> arrayList = Arrays.asList("Pavel", "Anna", "Bob", "Pavel", "Anna", "Tom", "Ben", "Pavel");
        System.out.println(getNumberDifferentWords(arrayList));


    }

    static int getNumberDifferentWords(List<String> words){

        int num = 0;

        Map<String, String> wordsMap = new HashMap<String, String>();

        for (String value: words){
            wordsMap.put(value, value);
        }

        for (Map.Entry<String, String> entry: wordsMap.entrySet()){
            num++;
        }

        return num;
    }
}
