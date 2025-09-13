package DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyMap {
    public static void main(String[] args) {
        Map<Integer,Integer> fMap = new HashMap<>();
        List<Integer> A = Arrays.asList(10, 20, 10, 5, 20);
        for(Integer i:A){
            if(fMap.containsKey(i)){
                fMap.put(i, fMap.get(i)+1);
            }
            else{
                fMap.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: fMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
