package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given an array which contains only 0s,1s and 2s,sort it in place
public class sortArray012 {

    private static void sortArrayOptimized(List<Integer> list){
        int low = 0; //next position for 0
        int high = list.size()-1 ;//next position for 2;
        int mid =0;
        while(mid < high){
            if(list.get(mid) == 0){
                int temp = list.get(mid);
                list.set(mid,list.get(low));
                list.set(low,temp);
                low++;
            }
            else if (list.get(mid) ==2){
                int temp = list.get(mid);
                list.set(mid,list.get(high));
                list.set(high,temp);
                high--;
            }
            else if(list.get(mid) ==1){
                mid++;
            }
        }
    }
    private static void sortArray(List<Integer> list){
        int write = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(i) == 0){
                int temp = list.get(write);
                list.set(write,list.get(i));
                list.set(i,temp);
                write++;
            }
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i) == 1){
                int temp = list.get(write);
                list.set(write,list.get(i));
                list.set(i,temp);
                write++;
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,0,2,0,1,2,1);
        sortArrayOptimized(list);
        System.out.println(list);
    }
}
