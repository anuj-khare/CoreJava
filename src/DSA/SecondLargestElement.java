package DSA;

import java.util.Arrays;
import java.util.List;

public class SecondLargestElement {
    public static void main(String[] args) {
        List<Integer> mylist = Arrays.asList(10,10,5);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(Integer i :mylist){
            if(i > largest ){
                secondLargest = largest;
                largest = i;
            }
            else if(i > secondLargest && i != largest){
                secondLargest = i;
            }
        }
        System.out.println(secondLargest);
    }

}
