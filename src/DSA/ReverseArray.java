package DSA;

import java.util.Arrays;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,12,25,36,99);
        int low = 0;
        int high = list.size()-1;
        while(low < high){
            int temp = list.get(low);
            list.set(low, list.get(high));
            list.set(high,temp);
            low++;
            high--;
        }
        for(Integer i : list){
            System.out.println(i);
        }
    }
}
