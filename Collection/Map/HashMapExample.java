package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        //adding key-value pair to the map
        map.put("AAA", 1);
        map.put("BBB", 2);

        System.out.println(map);

        //get the value associated with a key
        int value = map.get("BBB");
        System.out.println(value);

        //check if the key is present
        if(map.containsKey("CCC")) {
            value = map.get("CCC");
            System.out.println(value);
        }
        else {
            System.out.println("Key CCC is not present");
        }
    }
}
