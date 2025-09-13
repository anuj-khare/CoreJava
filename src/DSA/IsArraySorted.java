package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IsArraySorted {

    private static Boolean isArraySorted(List<Integer> list){
        for(int i =0;i<list.size()-1;i++){
            if(i< list.size() && list.get(i) > list.get(i+1)){
                return false;
            }
        }
        return true;
    }
    static List<Integer> mylist = Arrays.asList(11,12,21,100);

    public static void main(String[] args) {
        if(isArraySorted(mylist)){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }

}
