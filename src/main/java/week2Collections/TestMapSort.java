package week2Collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMapSort {

    public static void main(String[] args) {

        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();

        testMap(linkedHashMap);
        System.out.println();
        testMap(treeMap);
    }

    static void testMap(Map<Integer, String> map){

        map.put(1, "Pavel");
        map.put(60, "Anna");
        map.put(15, "Tom");
        map.put(100, "Liza");
        map.put(50, "Pavel");

        for (Map.Entry<Integer, String> name: map.entrySet()){
            System.out.println(name.getKey() + " - " + name.getValue());
        }
    }
}
