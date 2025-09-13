package DSA;

/*
[0, 1, 0, 3, 12]
Output: [1, 3, 12, 0, 0]


[0, 0, 1]
Output: [1, 0, 0]
 */

import java.util.Arrays;
import java.util.List;

public class MoveZerosTotheEnd {
    private static void print(List<Integer> mylist){
        for(int element : mylist){
            System.out.println(element);
        }
    }
    public static void moveZeroes(List<Integer> list){
        int count =0;
        for(int i=0;i<list.size();i++){
            if(list.get(i) ==0){
                count++;
            }
        }
        for(int i=0;i<list.size();i++){
            if(i < count && list.get(i) != 0){
                int temp = list.get(i);
                list.set(i,list.get(i-1));
                list.set(i-1,temp);
            }
            else{
                if(list.get(i) != 0){
                    int temp = list.get(i);
                    list.set(i,list.get(i-count));
                    list.set(i-count,temp);
                }
            }
        }
        print(list);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0,1,0,3,12);
//        for(int i=0;i<list.size();i++){
//            for(int j=i+1;j<list.size();j++){
//                if(list.get(i) == 0){
//                    int temp = list.get(i);
//                    list.set(i,list.get(j));
//                    list.set(j,temp);
//                }
//            }
//        }
//        for(int element : list){
//            System.out.println(element);
//        }
        moveZeroes(list);
    }
}
