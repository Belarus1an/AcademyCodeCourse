package week2Collections;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {

        Map<Integer, String> testMap = new HashMap<Integer, String>();

        testMap.put(1, "One");
        testMap.put(2, "Two");
        testMap.put(3, "three");

        for (Map.Entry<Integer, String> number: testMap.entrySet()){
            System.out.println(number.getKey() + " - " + number.getValue());
        }
    }
}
