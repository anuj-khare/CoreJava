package DSA;

import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {
    public static void main(String[] args) {
        Map<String,String> myMap = new HashMap<>();
        myMap.put("Anuj","khare");
        myMap.put("Jitendra","Khanna");
        myMap.put("Monu","Rajput");
        for(Map.Entry<String,String> entry:myMap.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
    }
}
