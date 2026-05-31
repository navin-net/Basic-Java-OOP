package navin.com.java.CollectionsFramework.HashMap;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("apple", 10.0);
        fruitMap.put("banana", 20.0);
        fruitMap.put("mango", 30.0);

        System.out.println("Create: " + fruitMap);

        // READ
        Double price = fruitMap.get("banana");
        System.out.println("Read (banana price): " + price);

        // UPDATE
        fruitMap.put("apple", 15.0); // update value
        System.out.println("Update (apple): " + fruitMap);

        // DELETE
        fruitMap.remove("mango");
        System.out.println("Delete (mango): " + fruitMap);

    }

}
