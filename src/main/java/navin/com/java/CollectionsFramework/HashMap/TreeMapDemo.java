package navin.com.java.CollectionsFramework.HashMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        Map<String, Integer> map = new TreeMap<>();

        // CREATE
        map.put("banana", 20);
        map.put("apple", 10);
        map.put("mango", 30);

        System.out.println("Sorted Map: " + map);

        // READ
        System.out.println("apple = " + map.get("apple"));

        // UPDATE
        map.put("apple", 15);
        System.out.println("After update: " + map);

        // DELETE
        map.remove("banana");
        System.out.println("After delete: " + map);
    }
}