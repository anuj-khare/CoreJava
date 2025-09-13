package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Smallest {
    private static int smallest;

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,14,10,-8,-11,-100);
        for(Integer i :list){
            smallest = Math.min(i,smallest);
        }
        System.out.println(smallest);
    }
}
